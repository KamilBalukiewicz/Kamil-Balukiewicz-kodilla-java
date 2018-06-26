package com.kodilla.rps;

public class Lizard implements Shape {
    @Override
    public String choose() {
    System.out.println("This is a lizard");
        return "Lizard";
    }

   /* @Override
    public void getLosingShape() {
        if (shape == paper || shape == spock) {
            System.out.println("Lizard wins");
        }
    }*/
}
