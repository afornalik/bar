package pl.afornalik.bar.serialization;

import pl.afornalik.bar.service.AvailableMenu;

import java.io.IOException;
import java.io.OutputStream;

public class MenuSerialization {

    private final OutputStream outputStream;

    public MenuSerialization(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void sendMenuToFile(AvailableMenu availableMenu) {
        try {
            outputStream.write(availableMenu.showMenu().toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException ignored) {
            }
        }
    }
}
