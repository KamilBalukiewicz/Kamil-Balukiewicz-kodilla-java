package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public final class FlightSearcher {
    public static void searchByDepartureCity(String departureCity) {
        FlightsList flightsList = new FlightsList();

        List<Flight> flightsFrom =  flightsList.getTheFlightList().stream()
                .filter(f -> f.getDepartureCity().equals(departureCity))
                .collect(toList());

        flightsFrom.stream()
                .forEach(System.out::println);
    }

    public static void searchByArrivalCity(String arrivalCity) {
        FlightsList flightsList = new FlightsList();

        flightsList.getTheFlightList().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .forEach(System.out::println);
    }

    public static void searchForConnectingFlight(String departureCity, String connectingCity, String arrivalCity) {
        FlightsList flightsList = new FlightsList();

        flightsList.getTheFlightList().stream()
                .filter(f -> f.getDepartureCity().equals(departureCity) ||
                        f.getArrivalCity().equals(arrivalCity))
                .filter(f1 -> f1.getDepartureCity().equals(connectingCity) ||
                        f1.getArrivalCity().equals(connectingCity))
                .forEach(System.out::println);
    }

    public static void searchForConnectingFlights(String departureCity, String arrivalCity) {
        FlightsList flightsList = new FlightsList();

        List<String> cityTo = flightsList.getTheFlightList().stream()
                .filter(f -> f.getDepartureCity().equals(departureCity))
                .map(f -> f.getArrivalCity())
                .collect(Collectors.toList());

        List<String> cityFrom = flightsList.getTheFlightList().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .map(f -> f.getDepartureCity())
                .collect(Collectors.toList());

        List<String> connectingCity = cityTo.stream()
                .filter(f -> cityFrom.contains(f))
                .collect(Collectors.toList());

        List<Flight> flightsFrom = flightsList.getTheFlightList().stream()
                .filter(f -> f.getDepartureCity().equals(departureCity) &&
                        connectingCity.contains(f.getArrivalCity()))
                .collect(toList());

        List<Flight> flightsTo = flightsList.getTheFlightList().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity) &&
                        connectingCity.contains(f.getDepartureCity()))
                .collect(Collectors.toList());

        System.out.println(flightsFrom + "\n" + flightsTo);

    }
}
