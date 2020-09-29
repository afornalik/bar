package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;

import java.util.List;

public class BreakfastMenu implements Menu<Meal> {

    private List<Meal> breakFastMeals;

    public BreakfastMenu(MealProvider<Meal> mealProvider){
        this.breakFastMeals = mealProvider.provide();
    }

    @Override
    public List<Meal> showMenu() {
        return breakFastMeals;
    }

    @Override
    public boolean addToMenu(Meal meal) {
        return breakFastMeals.add(meal);
    }


}