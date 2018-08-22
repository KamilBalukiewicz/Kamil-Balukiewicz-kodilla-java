package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPepperoniPeppersMushroomsOlivesChivesGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new GreenPeppersDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ChivesDecorator(theOrder);
        System.out.println(theOrder.getPrice());
        //when
        BigDecimal thePrice = theOrder.getPrice();
        //then
        assertEquals(new BigDecimal(23), thePrice);
    }
    @Test
    public void testPepperoniPeppersMushroomsOlivesChivesGetToppings() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new GreenPeppersDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ChivesDecorator(theOrder);
        System.out.println(theOrder.getToppings());
        //when
        String toppings = theOrder.getToppings();
        //then
        assertEquals("Pie, tomato sauce and cheese + pepperoni + green peppers + mushrooms" +
                " + olives + chives", toppings);
    }

    @Test
    public void testPineappleAndExtraCheeseGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineappleDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getPrice());
        //when
        BigDecimal thePrice = theOrder.getPrice();
        //then
        assertEquals(new BigDecimal(19), thePrice);
    }

    @Test
    public void testPineappleAndExtraCheeseGetToppings() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineappleDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getToppings());
        //when
        String toppings = theOrder.getToppings();
        //then
        assertEquals("Pie, tomato sauce and cheese + pineapple + extra cheese", toppings);
    }

    @Test
    public void testDoubleBaconAnchoviesPepperoniExtraCheeseGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new AnchoviesDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getPrice());
        //when
        BigDecimal thePrice = theOrder.getPrice();
        //then
        assertEquals(new BigDecimal(34), thePrice);
    }
    @Test
    public void testDoubleBaconAnchoviesPepperoniExtraCheeseGetToppings() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new AnchoviesDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getToppings());
        //when
        String toppings = theOrder.getToppings();
        //then
        assertEquals("Pie, tomato sauce and cheese + bacon + bacon + anchovies" +
                " + pepperoni + extra cheese", toppings);
    }
}
