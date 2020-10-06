package pl.afornalik.bar.config;

import com.google.inject.AbstractModule;
import pl.afornalik.bar.service.DefaultOrder;
import pl.afornalik.bar.service.Meals;
import pl.afornalik.bar.service.OrderMeals;
import pl.afornalik.bar.service.PredefinedMealsSets;

public class MealsModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(OrderMeals.class).toInstance(new DefaultOrder());
        bind(Meals.class).toInstance(new PredefinedMealsSets());
    }
}
