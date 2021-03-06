package pl.afornalik.bar.serialization;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import pl.afornalik.bar.model.Menu;
import pl.afornalik.bar.service.BreakfastMenu;
import pl.afornalik.bar.service.AvailableMenu;
import pl.afornalik.bar.service.TemporaryMealProvider;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MenuSerializationTest {

    private final static String FILE_NAME = "../menu.ser";
    private Menu breakfastAvailableMenu;
    private OutputStream outputStream;

    @Test
    public void shouldWriteMenuToFile() throws IOException {
        //given
        breakfastAvailableMenu = new BreakfastMenu(new TemporaryMealProvider()).showMenu();
        outputStream = new FileOutputStream(FILE_NAME);
        MenuSerialization menuSerialization = new MenuSerialization();
        //when
        outputStream.write(menuSerialization.serialize(breakfastAvailableMenu));
        //then
        Assert.assertTrue(Files.exists(Paths.get(FILE_NAME)));
    }

    @AfterClass
    public static void tearDown() throws IOException {
        //Files.delete(Paths.get(FILE_NAME));
    }
}