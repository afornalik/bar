package pl.afornalik.bar.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void sendText(String msg) {
        out.println(msg);
    }

    public void sendBytes(byte[] bytes) throws IOException {
        clientSocket.getOutputStream().write(bytes);
    }

    public String readText() throws IOException {
        return in.readLine();
    }

    public byte[] readByteArray() throws IOException {
        return clientSocket.getInputStream().readAllBytes();
    }
    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
