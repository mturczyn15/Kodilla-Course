package com.example.patterns2.decorator.pizza;

import com.example.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;

import java.math.BigDecimal;

public class BaconDecorator extends AbstractPizzaOrderDecorator {
    protected BaconDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and bacon";
    }
}
