package com.kodilla.rps;

public class Paper implements Shape {
    @Override
    public String choose() {
        System.out.println("This is paper");
        return "Paper";
    }
    /*@Override
    public void getLosingShape() {
        if(shape == rock || shape == spock) {
            System.out.println("Paper wins");
        }
    }*/
}
