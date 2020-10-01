package pl.afornalik.bar.serialization;

import pl.afornalik.bar.model.Menu;
import pl.afornalik.bar.service.AvailableMenu;

import java.io.IOException;
import java.io.OutputStream;

public class MenuSerialization implements Serialize<Menu>{

    public byte[] serialize(Menu menu) {
        return menu.toByteArray();
    }
}
