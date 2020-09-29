package pl.afornalik.bar.serialization;

import pl.afornalik.bar.model.Meal;
import pl.afornalik.bar.service.BreakfastMenu;
import pl.afornalik.bar.service.Menu;
import pl.afornalik.bar.service.TemporaryMealProvider;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.stream.Collectors;

public class BarSerialization {

    private final OutputStream outputStream;
    private Menu<Meal> menu = new BreakfastMenu(new TemporaryMealProvider());

    public BarSerialization(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public <T extends Meal> void sendMenuToFile(Menu<T> menu) {
        try  {
            writeMealsToFile((FileOutputStream)outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeMealsToFile(FileOutputStream fileOutputStream) throws IOException {
        for (byte[] meal : convertMealsToByteArrays()) {
            fileOutputStream.write(meal);
        }
    }

    private List<byte[]> convertMealsToByteArrays() {
        return menu.showMenu().stream()
                .map(Meal::toByteArray)
                .collect(Collectors.toList());
    }
}
