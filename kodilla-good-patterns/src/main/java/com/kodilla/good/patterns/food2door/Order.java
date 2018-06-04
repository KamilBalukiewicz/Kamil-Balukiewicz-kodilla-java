package com.kodilla.good.patterns.food2door;

public class Order {
    public double quantityOfProduce;
    public String nameOfProduce;

    public Order(double quantityOfProduce, String nameOfProduce) {
        this.quantityOfProduce = quantityOfProduce;
        this.nameOfProduce = nameOfProduce;
    }

    public double getQuantityOfProduce() {
        return quantityOfProduce;
    }

    public String getNameOfProduce() {
        return nameOfProduce;
    }
}
