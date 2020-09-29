package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;

import java.util.List;

public interface MealProvider<T extends Meal> {

    List<Meal> provide();
}
