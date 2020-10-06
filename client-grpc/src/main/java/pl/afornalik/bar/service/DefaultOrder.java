package pl.afornalik.bar.service;

import com.google.inject.Inject;
import pl.afornalik.bar.model.Client;
import pl.afornalik.bar.model.Meal;

import java.util.List;

public class DefaultOrder implements OrderMeals{

    @Inject
    private Meals meals;

    @Override
    public Client order() {
        return Client.newBuilder().addAllMeals(meals.provide()).build();
    }

    public List<Meal> showMeals() {
        return meals.provide();
    }
}
