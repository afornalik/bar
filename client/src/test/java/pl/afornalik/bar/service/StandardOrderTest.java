package pl.afornalik.bar.service;

import org.junit.Assert;
import org.junit.Test;
import pl.afornalik.bar.model.Meal;

public class StandardOrderTest {

    @Test
    public void shouldCreateMeal() {
        //given
        StandardOrder standardOrder = new StandardOrder();
        //when
        Meal result = standardOrder.orderMeal(1);
        //then
        Assert.assertNotNull(result);
    }

}