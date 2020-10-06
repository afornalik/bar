package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;

public interface Order<T extends Meal> {

    boolean orderMeal(int id);
}
