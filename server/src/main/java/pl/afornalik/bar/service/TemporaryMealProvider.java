package pl.afornalik.bar.service;

import com.google.common.collect.Lists;
import pl.afornalik.bar.model.Meal;

import java.util.List;

public class TemporaryMealProvider implements MealProvider<Meal>{

    public List<Meal> provide() {
        return Lists.newArrayList(
                buildMeal(1, "Sandwich"),
                buildMeal(2, "Toast"),
                buildMeal(3, "Juice"),
                buildMeal(4, "Scrambled eggs"));
    }

    private Meal buildMeal(Integer id, String name) {
        return Meal.newBuilder().setId(id).setName(name).build();
    }
}
