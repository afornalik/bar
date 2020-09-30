package pl.afornalik.bar.serialization;

import pl.afornalik.bar.model.Meal;
import pl.afornalik.bar.service.BreakfastAvailableMenu;
import pl.afornalik.bar.service.AvailableMenu;
import pl.afornalik.bar.service.TemporaryMealProvider;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.stream.Collectors;

public class BarSerialization {

    private final OutputStream outputStream;

    public BarSerialization(OutputStream outputStream) {
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
