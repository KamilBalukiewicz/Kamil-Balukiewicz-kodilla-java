package com.kodilla.good.patterns.food2door;

public class OrderConfirmator {
    private PlacedOrder placedOrder;

    public OrderConfirmator(PlacedOrder placedOrder) {
        this.placedOrder = placedOrder;
    }

    public void confirmOrder() {
        System.out.println("Your order for " + placedOrder.getOrder() + " from " + placedOrder.getProducerName() +
                " has been confirmed");
    }
}
