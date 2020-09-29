package pl.afornalik.bar.service;

import org.junit.Assert;
import org.junit.Test;
import pl.afornalik.bar.model.Meal;

import java.util.List;

public class TemporaryMealProviderTest {

    public static int INITIAL_NUMBERS_OF_MEALS = 4;

    @Test
    public void shouldReturnListWithFourObjects() {
        //given
        TemporaryMealProvider temporaryMealProvider = new TemporaryMealProvider();
        //when
        List<Meal> results = temporaryMealProvider.provide();
        //then
        Assert.assertEquals(results.size(), INITIAL_NUMBERS_OF_MEALS);
    }
}