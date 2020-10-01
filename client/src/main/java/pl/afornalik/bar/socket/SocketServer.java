package pl.afornalik.bar.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketServer {

    private final String hostName = "menu_server";
    private int port = 33245;

    public void getMessage() {
        try (
                Socket socket = new Socket(hostName, port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))
        ) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
