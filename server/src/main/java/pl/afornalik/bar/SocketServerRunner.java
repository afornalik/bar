package pl.afornalik.bar;

import pl.afornalik.bar.socket.SocketServer;

import java.io.IOException;

public class SocketServerRunner {

    private static SocketServer socketServer;

    public static void main(String[] args) {

        socketServer = new SocketServer();
        try {
            socketServer.start(54332);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
