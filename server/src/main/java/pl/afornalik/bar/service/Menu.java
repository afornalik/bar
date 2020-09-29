package pl.afornalik.bar.service;

import pl.afornalik.bar.model.Meal;

import java.util.List;

public interface Menu<T extends Meal> {

    List<T> showMenu();

    boolean addToMenu(T t);
}
