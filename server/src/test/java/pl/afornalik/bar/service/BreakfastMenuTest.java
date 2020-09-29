package pl.afornalik.bar.service;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import pl.afornalik.bar.model.Meal;

import java.util.List;

public class BreakfastMenuTest {

    public static int INITIAL_NUMBERS_OF_MEALS = 2;

    private final MealProvider<Meal> mealProvider = Mockito.mock(TemporaryMealProvider.class);

    @Test
    public void shouldBeSomeFourValueInitiallyInTheMenu() {
        //given
        Mockito.when(mealProvider.provide()).thenReturn(this.provideDummyMeals());
        BreakfastMenu breakfastMenu = new BreakfastMenu(mealProvider);
        //when
        List<Meal> result = breakfastMenu.showMenu();
        //then
        Assert.assertNotNull(result);
        Assert.assertFalse(result.isEmpty());
        Assert.assertEquals(result.size(), INITIAL_NUMBERS_OF_MEALS);
    }

    @Test
    public void shouldEachMealHaveIdSetup() {
        //given
        Mockito.when(mealProvider.provide()).thenReturn(this.provideDummyMeals());
        BreakfastMenu breakfastMenu = new BreakfastMenu(mealProvider);
        //when
        List<Meal> result = breakfastMenu.showMenu();
        //then
        Assert.assertFalse(result.stream().anyMatch(meal -> meal.getId() == 0));
    }

    @Test
    public void shouldEachMealHaveNameSetup() {
        //given
        Mockito.when(mealProvider.provide()).thenReturn(this.provideDummyMeals());
        BreakfastMenu breakfastMenu = new BreakfastMenu(mealProvider);
        //when
        List<Meal> result = breakfastMenu.showMenu();
        //then
        Assert.assertFalse(result.stream().anyMatch(meal -> meal.getName() == null || meal.getName().equals("")));
    }

    private List<Meal> provideDummyMeals() {
        return Lists.newArrayList(Meal.newBuilder().setId(1).setName("Sandwich").build(),
                Meal.newBuilder().setId(2).setName("Toast").build());
    }

}