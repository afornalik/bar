package pl.afornalik.bar;

import pl.afornalik.bar.grpc.ClientOrderServer;

import java.io.IOException;

public class GrpcServerRunner {

    public static void main(String[] args) throws IOException {

        ClientOrderServer orderServer = new ClientOrderServer(12654,"bar-server");
        orderServer.buildServer();

        orderServer.start();
    }
}