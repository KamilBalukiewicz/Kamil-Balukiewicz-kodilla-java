package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BaconDecorator extends AbstractPizzaDecorator {
    public BaconDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " + bacon";
    }
}
