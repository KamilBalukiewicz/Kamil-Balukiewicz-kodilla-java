package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AnchoviesDecorator extends AbstractPizzaDecorator {
    public AnchoviesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " + anchovies";
    }
}