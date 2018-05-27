package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) {
        double result = 0;
        try {
            result = a / b;
            if(b == 0)
                throw new ArithmeticException();
        }
        catch (ArithmeticException e){
                System.out.println("Something went wrong! Error: " + e);
        } finally {
            System.out.println("Remember not to divide by 0!");
        }
        return result;

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}