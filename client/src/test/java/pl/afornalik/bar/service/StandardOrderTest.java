package pl.afornalik.bar.service;

import org.junit.Assert;
import org.junit.Test;

public class StandardOrderTest {

    @Test
    public void shouldCreateMeal() {
        //given
        StandardOrder standardOrder = new StandardOrder();
        //when
        boolean result = standardOrder.orderMeal(1);
        //then
        Assert.assertTrue(result);
    }

}