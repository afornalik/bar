package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;

public class StandardOrder implements Order<Meal> {

    @Override
    public boolean orderMeal(int id) {
        return true;
    }
}
