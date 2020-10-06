package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Client;
import pl.afornalik.bar.model.Meal;

import java.util.List;

public interface OrderMeals {

    Client order();

    List<Meal> showMeals();
}
