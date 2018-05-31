package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("New York", "Berlin");
        Flight flight1 = new Flight("Los Angeles", "Warsaw");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("Paris", "Berlin");
        Flight flight4 = new Flight("Berlin", "Warsaw");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry. You can't go there");
        } finally {
            System.out.println("See where else you could go to");
        }
        System.out.println("Choose your journey");
    }
}
