package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniDecorator extends AbstractPizzaDecorator {
    public PepperoniDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " + pepperoni";
    }
}