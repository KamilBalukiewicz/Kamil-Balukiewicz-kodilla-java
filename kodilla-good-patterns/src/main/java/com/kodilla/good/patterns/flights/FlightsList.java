package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public final class FlightsList {
    private final List<Flight> theFlightList = new ArrayList<>();

    public FlightsList() {
        theFlightList.add(new Flight("Warsaw", "Cracow", LocalDateTime.now().plusHours(35)));
        theFlightList.add(new Flight("Warsaw", "Gdansk", LocalDateTime.now().plusHours(45)));
        theFlightList.add(new Flight("Warsaw", "Wroclaw", LocalDateTime.now().plusHours(53)));
        theFlightList.add(new Flight("Gdansk", "Cracow", LocalDateTime.now().plusHours(41)));
        theFlightList.add(new Flight("Gdansk", "Warsaw", LocalDateTime.now().plusHours(84)));
        theFlightList.add(new Flight("Gdansk", "Katowice", LocalDateTime.now().plusHours(75)));
        theFlightList.add(new Flight("Cracow", "Wroclaw", LocalDateTime.now().plusHours(22)));
        theFlightList.add(new Flight("Cracow", "Gdansk", LocalDateTime.now().plusHours(63)));
        theFlightList.add(new Flight("Cracow", "Warsaw", LocalDateTime.now().plusHours(15)));
        theFlightList.add(new Flight("Wroclaw", "Warsaw", LocalDateTime.now().plusHours(45)));
        theFlightList.add(new Flight("Wroclaw", "Cracow", LocalDateTime.now().plusHours(73)));
        theFlightList.add(new Flight("Katowice", "Gdansk", LocalDateTime.now().plusHours(39)));
    }

    public List<Flight> getTheFlightList() {
        return new ArrayList<>(theFlightList);
    }
}
