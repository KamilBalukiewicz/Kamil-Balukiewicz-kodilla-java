package com.kodilla.rps;

import java.util.Random;

public class ShapesPicker {

    public Shape chosenShape() {
        Shape theShape;
        Random generator = new Random();
        int chosen = generator.nextInt(5);
        if (chosen == 0) {
            theShape = new Paper();
        } else if (chosen == 1) {
            theShape = new Rock();
        } else if (chosen == 2) {
            theShape = new Scissors();
        } else if (chosen == 3) {
            theShape = new Lizard();
        } else {
            theShape = new Spock();
        }
        return theShape;

    }
}
