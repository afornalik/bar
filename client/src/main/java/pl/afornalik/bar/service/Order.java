package pl.afornalik.bar.service;

public interface Order<T> {

    T orderMeal(int id);
}
