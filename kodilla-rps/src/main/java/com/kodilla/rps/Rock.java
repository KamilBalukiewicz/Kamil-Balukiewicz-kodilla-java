package com.kodilla.rps;

public class Rock implements Shape {
    @Override
    public String choose() {
        System.out.println("This is a rock");
        return "Rock";
    }

    /*@Override
    public void getLosingShape() {
        if (shape == scissors || shape == lizard) {
            System.out.println("Rock wins");
        }
    }*/
}
