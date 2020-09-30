package pl.afornalik.bar.service;

import java.util.List;

public interface MealProvider<Meal> {

    List<Meal> provide();
}
