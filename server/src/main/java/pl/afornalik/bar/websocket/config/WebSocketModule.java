package pl.afornalik.bar.websocket.config;

import com.google.inject.AbstractModule;

public class WebSocketModule extends AbstractModule {

    @Override
    protected void configure() {
        requestStaticInjection(WebSocketConfigurator.class);
    }
}
