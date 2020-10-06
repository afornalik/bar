package pl.afornalik.bar.model.deserialized;

import pl.afornalik.bar.model.Meal;

import java.util.List;

public class AvailableMeals {

    private final List<Meal> meals;

    public AvailableMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }
}
