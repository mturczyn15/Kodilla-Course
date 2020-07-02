package com.example.patterns2.decorator.pizza;

import com.example.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;
import com.example.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class MildSauceDecorator extends AbstractPizzaOrderDecorator {
    protected MildSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and mild sauce";
    }
}
