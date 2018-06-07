package com.kodilla.good.patterns.flights;

public class FlightSearchApp {
    public static void main(String[] args) {

        FlightSearcher.searchByDepartureCity("Warsaw");

        FlightSearcher.searchByArrivalCity("Katowice");

        FlightSearcher.searchForConnectingFlight("Gdansk", "Cracow", "Wroclaw");

        FlightSearcher.searchForConnectingFlights("Gdansk", "Wroclaw");
    }
}
