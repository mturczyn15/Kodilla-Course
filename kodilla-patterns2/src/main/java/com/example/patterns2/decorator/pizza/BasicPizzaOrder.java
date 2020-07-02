package com.example.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(50);
    }

    @Override
    public String getDescription() {
        return "Basic pizza with cake and cheese and ham";
    }
}
