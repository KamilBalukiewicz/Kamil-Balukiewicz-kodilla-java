package com.kodilla.rps;

public class Spock implements Shape {
    @Override
    public String choose() {
        System.out.println("This is Spock");
        return "Spock";
    }

    /*@Override
    public void getLosingShape() {
        if (shape == scissors || shape == rock) {
            System.out.println("Spock wins");
        }
    }*/
}
