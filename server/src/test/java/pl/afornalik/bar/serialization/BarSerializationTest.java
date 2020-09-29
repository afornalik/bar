package pl.afornalik.bar.serialization;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import pl.afornalik.bar.model.Meal;
import pl.afornalik.bar.service.BreakfastMenu;
import pl.afornalik.bar.service.Menu;
import pl.afornalik.bar.service.TemporaryMealProvider;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BarSerializationTest {

    private final static String FILE_NAME = "../menu.ser";
    private Menu<Meal> breakfastMenu;
    private OutputStream outputStream;

    @Test
    public void shouldWriteMenuToFile() throws FileNotFoundException {
        //given
        breakfastMenu = new BreakfastMenu(new TemporaryMealProvider());
        outputStream = new FileOutputStream(FILE_NAME);
        BarSerialization barSerialization = new BarSerialization(outputStream);
        //when
        barSerialization.sendMenuToFile(breakfastMenu);
        //then
        Assert.assertTrue(Files.exists(Paths.get(FILE_NAME)));
    }

    @AfterClass
    public static void tearDown() throws IOException {
        Files.delete(Paths.get(FILE_NAME));
    }
}