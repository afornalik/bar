package pl.afornalik.bar.grpc;

import com.google.protobuf.compiler.PluginProtos;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.afornalik.bar.service.BarService;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class ClientOrderServer {

    private Logger logger = LoggerFactory.getLogger(ClientOrderServer.class);

    private final int port;
    private final String hostName;
    private Server server;

    public ClientOrderServer(int port, String hostName) {
        this.port = port;
        this.hostName = hostName;
    }

    public void buildServer() throws IOException {
        System.out.println("Server is starting ...");
        server = ServerBuilder.forPort(port)
                .addService(new BarService())
                .build();
        System.out.println("Server successfully started on port: " + port);
    }

    public void start() throws IOException {
        server.start();
        try {
            server.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
