package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape figure = null;
        if (n >= 0 && n < shapes.size()) {
            figure = shapes.get(n);
        }
        return figure;
    }
    public void showFigures() {
        if(shapes.size() > 0) {
            for (Shape figure : shapes) {
                System.out.println(figure);
            }
        }else {
            System.out.println("Collection is empty");
        }
    }
    public int getFiguresQuantity() {
        return shapes.size();
    }

    public Shape getShape() {
        return shape;
    }
}
