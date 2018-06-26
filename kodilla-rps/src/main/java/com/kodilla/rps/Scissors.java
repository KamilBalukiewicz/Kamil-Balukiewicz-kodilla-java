package com.kodilla.rps;

public class Scissors implements Shape {
    @Override
    public String choose() {
        System.out.println("These are scissors");
        return "Scissors";
    }

    /*@Override
    public void getLosingShape() {
        if (shape == paper || shape == lizard) {
            System.out.println("Scissors wins");
        }
    }*/
}
