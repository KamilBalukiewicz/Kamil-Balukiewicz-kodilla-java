package com.kodilla.testing.shape;

public class Square implements Shape {
    //l is for length
    double l;

    public Square(double l) {
        this.l = l;
    }

    @Override
    public double getArea() {
        return l * l;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    public double getL() {
        return l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.l, l) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(l);
        return (int) (temp ^ (temp >>> 32));
    }
}
