package com.kodilla.good.patterns.food2door;

public class PlacedOrderRetriever {

    public PlacedOrder retrieve() {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Extra Food Shop",
                new Order(5, "Potatoes"));

        return new PlacedOrder(extraFoodShop.getProducerName(), extraFoodShop.getOrder());
    }
}
