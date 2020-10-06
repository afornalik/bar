package pl.afornalik.bar.socket;

import pl.afornalik.bar.deserialization.AvailableMealsDeserialization;
import pl.afornalik.bar.deserialization.Deserialization;
import pl.afornalik.bar.model.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private Deserialization<Menu> menuDeserialization = new AvailableMealsDeserialization();

    public void startConnection( String ip, int port) throws IOException {
        clientSocket = new Socket(ip,port);
        out = new PrintWriter(clientSocket.getOutputStream(),true);
        in = new BufferedReader(new InputStreamReader((clientSocket.getInputStream())));
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String response;
        if (msg.equals("menu")){
            response = menuDeserialization.deserialize(clientSocket.getInputStream().readAllBytes()).toString();
        }else {
            response = in.readLine();
        }
        return response;
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }
}
