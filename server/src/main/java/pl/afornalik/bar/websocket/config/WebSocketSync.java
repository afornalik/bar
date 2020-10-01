package pl.afornalik.bar.websocket.config;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.afornalik.bar.serialization.MenuSerialization;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/menu", configurator = WebSocketConfigurator.class)
public class WebSocketSync {

    private static final Logger LOGGER = LoggerFactory.getLogger(MenuSerialization.class);
    private final MenuSerialization menuSerialization;

    @Inject
    public WebSocketSync(MenuSerialization menuSerialization) {
        this.menuSerialization = menuSerialization;
    }

    @OnOpen
    public void onOpen(Session session) {
        LOGGER.debug(String.format("WebSocket opened: %s", session.getId()));
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        LOGGER.debug(String.format("Message received: %s", message));
        session.getBasicRemote().sendText(message.toUpperCase());
    }

    @OnClose
    public void onClose(CloseReason reason, Session session) {
        LOGGER.debug(String.format("Closing a WebSocket (%s) due to %s", session.getId(), reason.getReasonPhrase()));
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        LOGGER.error(String.format("Error in WebSocket session %s%n", session == null ? "null" : session.getId(), throwable));
    }

}
