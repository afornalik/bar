package pl.afornalik.bar.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.afornalik.bar.serialization.MenuSerialization;
import pl.afornalik.bar.service.BreakfastMenu;
import pl.afornalik.bar.service.TemporaryMealProvider;

import java.io.IOException;

public class IncomingMessage {

    private final SocketServer socketServer;
    private MenuSerialization menuSerialization = new MenuSerialization();
    private Logger logger = LoggerFactory.getLogger(IncomingMessage.class);

    public IncomingMessage(SocketServer socketServer) {
        this.socketServer = socketServer;
    }

    public boolean getClientMessage() throws IOException {
        String greeting = socketServer.readText();
        logger.debug("Incoming message was: " + greeting);
        switch (greeting) {
            case "hello server":
                socketServer.sendText("hello client");
                break;
            case "menu":
                socketServer.sendBytes(menuSerialization.serialize(new BreakfastMenu(new TemporaryMealProvider()).showMenu()));
                break;
            case "bye bye":
                socketServer.sendText("Connection terminated, bye!");
                socketServer.stop();
                return false;
            default:
                socketServer.sendText("unrecognised greeting");
                break;
        }
        return true;
    }

}
