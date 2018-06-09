package com.kodilla.good.patterns.food2door;

public class PlacedOrderDto {
    public PlacedOrder placedOrder;
    public boolean isOrdered;

    public PlacedOrderDto(PlacedOrder placedOrder, boolean isOrdered) {
        this.placedOrder = placedOrder;
        this.isOrdered = isOrdered;
    }

    public PlacedOrder getPlacedOrder() {
        return placedOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
