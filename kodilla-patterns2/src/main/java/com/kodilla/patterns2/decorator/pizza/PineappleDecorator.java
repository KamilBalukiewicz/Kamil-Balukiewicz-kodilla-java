package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PineappleDecorator extends AbstractPizzaDecorator {
    public PineappleDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " + pineapple";
    }
}
