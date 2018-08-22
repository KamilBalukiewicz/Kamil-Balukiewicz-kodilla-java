package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GreenPeppersDecorator extends AbstractPizzaDecorator {
    public GreenPeppersDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(1));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " + green peppers";
    }
}
