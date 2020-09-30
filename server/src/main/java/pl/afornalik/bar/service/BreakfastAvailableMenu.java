package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;
import pl.afornalik.bar.model.Menu;

public class BreakfastAvailableMenu implements AvailableMenu {

    private final Menu breakFastMenu;

    public BreakfastAvailableMenu(MealProvider<Meal> mealProvider) {
        this.breakFastMenu = Menu.newBuilder().addAllMeals(mealProvider.provide()).build();
    }

    @Override
    public Menu showMenu() {
        return breakFastMenu;
    }

    @Override
    public void addToMenu(Meal meal) {
        breakFastMenu.toBuilder().addMeals(meal).build();
    }


}