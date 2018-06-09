package com.kodilla.good.patterns.food2door;

public class Food2DoorApp {
    public static void main(String[] args) {
        PlacedOrderRetriever placedOrderRetriever = new PlacedOrderRetriever();
        PlacedOrder placedOrder = placedOrderRetriever.retrieve();

        PlacedOrderProcessor placedOrderProcessor = new PlacedOrderProcessor(new OrderConfirmator(placedOrder));
        placedOrderProcessor.processPlacedOrder(placedOrder);
    }
}
