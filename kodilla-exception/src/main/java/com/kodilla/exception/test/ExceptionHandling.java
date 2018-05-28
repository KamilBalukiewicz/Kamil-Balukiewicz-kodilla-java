package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
            System.out.println("Done!");
        } catch (SCException e) {
            System.out.println("Illegal number!");
        } finally {
            System.out.println("Operation finished!");
        }
    }
}
