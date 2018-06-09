package com.kodilla.good.patterns.food2door;

public class PlacedOrderProcessor {
    private OrderConfirmator orderConfirmator;

    public PlacedOrderProcessor(final OrderConfirmator orderConfirmator) {
        this.orderConfirmator = orderConfirmator;
    }

    public PlacedOrderDto processPlacedOrder(final PlacedOrder placedOrder) {
        orderConfirmator.confirmOrder();
        return new PlacedOrderDto(placedOrder, true);
    }
}
