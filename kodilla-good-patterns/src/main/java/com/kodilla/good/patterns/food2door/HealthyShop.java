package com.kodilla.good.patterns.food2door;

public class HealthyShop implements OrderProcess {
    public String producerName;
    public Order order;

    public HealthyShop(String producerName, Order order) {
        this.producerName = producerName;
        this.order = order;
    }

    public String getProducerName() {
        return producerName;
    }

    public Order getOrder() {
        return order;
    }

    public PlacedOrder process(Order order) {
        if(order.getQuantityOfProduce() > 0) {
            return new PlacedOrder(producerName, order);
        } else {
            System.out.println("Sorry, we can't take your order at the moment");
            return null;
        }
    }
}
