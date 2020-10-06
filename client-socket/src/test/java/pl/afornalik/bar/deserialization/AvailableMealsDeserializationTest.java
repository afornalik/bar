package pl.afornalik.bar.deserialization;

import org.junit.Assert;
import org.junit.Test;
import pl.afornalik.bar.model.Meal;
import pl.afornalik.bar.model.Menu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AvailableMealsDeserializationTest {

    private final static String FILE_NAME = "../menu.ser";
    private InputStream fileInputStream;

    @Test
    public void shouldDeserializeMenu() throws IOException {
        //given
        fileInputStream = new FileInputStream(FILE_NAME);
        AvailableMealsDeserialization availableMealsDeserialization = new AvailableMealsDeserialization();
        //when
        Menu result = availableMealsDeserialization.deserialize(fileInputStream.readAllBytes());
        //then
        Assert.assertFalse(result.getMealsList().isEmpty());
    }

    @Test
    public void shouldAllMealsBeInitialized() throws IOException {
        //given
        fileInputStream = new FileInputStream(FILE_NAME);
        AvailableMealsDeserialization availableMealsDeserialization = new AvailableMealsDeserialization();
        //when
        Menu result = availableMealsDeserialization.deserialize(fileInputStream.readAllBytes());
        //then
        Assert.assertTrue(result.getMealsList().stream().allMatch(Meal::isInitialized));
    }

    @Test
    public void shouldAllMealsHaveIdSetup() throws IOException {
        //given
        fileInputStream = new FileInputStream(FILE_NAME);
        AvailableMealsDeserialization availableMealsDeserialization = new AvailableMealsDeserialization();
        //when
        Menu result = availableMealsDeserialization.deserialize(fileInputStream.readAllBytes());
        //then
        Assert.assertTrue(result.getMealsList().stream().allMatch(meal -> meal.getId() != 0));
    }

    @Test
    public void shouldAllMealsHaveNameSetup() throws IOException {
        //given
        fileInputStream = new FileInputStream(FILE_NAME);
        AvailableMealsDeserialization availableMealsDeserialization = new AvailableMealsDeserialization();
        //when
        Menu result = availableMealsDeserialization.deserialize(fileInputStream.readAllBytes());
        //then
        Assert.assertTrue(result.getMealsList().stream().allMatch(meal -> meal.getName() != null && !meal.getName().equals("")));
    }
}