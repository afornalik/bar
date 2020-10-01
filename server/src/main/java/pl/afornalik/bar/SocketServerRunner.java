package pl.afornalik.bar;

import pl.afornalik.bar.socket.IncomingMessage;
import pl.afornalik.bar.socket.SocketServer;

import java.io.IOException;

public class SocketServerRunner {

    private SocketServer socketServer = new SocketServer();
    private IncomingMessage message = new IncomingMessage(socketServer);

    public static void main(String[] args) throws IOException {

        SocketServerRunner socketServerRunner = new SocketServerRunner();

        socketServerRunner.socketServer.start(54332);
        socketServerRunner.message.getClientMessage();
     //   socketServerRunner.message.getClientMessage();
       // socketServerRunner.message.getClientMessage();
       // socketServerRunner.message.getClientMessage();
       // socketServerRunner.message.getClientMessage();

        socketServerRunner.socketServer.stop();

    }
}
