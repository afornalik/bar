package pl.afornalik.bar.service;

import com.google.common.collect.Lists;
import pl.afornalik.bar.model.Meal;

import java.util.List;

public class PredefinedMealsSets implements Meals {

    private List<Meal> meals = Lists.newArrayList(
            Meal.newBuilder().setName("Toast").build(),
            Meal.newBuilder().setName("Toast").build(),
            Meal.newBuilder().setName("Toast").build(),
            Meal.newBuilder().setName("Juice").build(),
            Meal.newBuilder().setName("Sandwich").build());

    @Override
    public List<Meal> provide() {
        return meals;
    }
}
