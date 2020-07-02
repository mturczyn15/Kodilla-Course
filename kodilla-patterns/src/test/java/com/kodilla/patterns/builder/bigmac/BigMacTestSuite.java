package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMacNew() {
        //Given
        BigMac pizza = new BigMac.BigMacBuilder()
                .bun(Bun.WITHOUTSEZAM)
                .ingredient(Ingredients.CHILI)
                .burgers(0)
                .sauce(Sauce.STANDARD)
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(1, howManyIngredients);
    }
}