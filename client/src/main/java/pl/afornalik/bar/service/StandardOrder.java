package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;

public class StandardOrder implements Order<Meal> {

    @Override
    public Meal orderMeal(int id) {
        return Meal.newBuilder().setId(id).build();
    }
}
