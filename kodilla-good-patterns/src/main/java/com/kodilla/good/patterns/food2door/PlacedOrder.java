package com.kodilla.good.patterns.food2door;

public class PlacedOrder {
    private String producerName;
    private Order order;

    public PlacedOrder(String producerName, Order order) {
        this.producerName = producerName;
        this.order = order;
    }

    public String getProducerName() {
        return producerName;
    }

    public Order getOrder() {
        return order;
    }
}
