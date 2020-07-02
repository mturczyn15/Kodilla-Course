package com.example.patterns2.decorator.pizza;

import com.example.patterns2.decorator.taxiportal.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithBaconAndSpicySauceAndMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new SpicySauceDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(65), theCost);
    }

    @Test
    public void testPizzaWithBaconAndSpicySauceAndMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new SpicySauceDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with cake and cheese and ham and bacon and spicy sauce and mushrooms", description);
    }
}
