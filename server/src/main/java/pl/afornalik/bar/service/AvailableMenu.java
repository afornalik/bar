package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;
import pl.afornalik.bar.model.Menu;

public interface AvailableMenu {

    Menu showMenu();

    void addToMenu(Meal meal);
}
