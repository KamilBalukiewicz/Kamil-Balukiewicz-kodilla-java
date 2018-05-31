package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("New York", true);
        flights.put("Los Angeles", true);
        flights.put("Berlin", false);

        if (!flights.containsKey(flight.getArrivalAirport()) || !flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Flight not found");
        }
        if (flights.containsKey(flight.getArrivalAirport()) && flights.containsKey(flight.getDepartureAirport())) {
            boolean value = flights.get(flight.getArrivalAirport());
            if(value) {
                System.out.println("Flight from " + flight.getDepartureAirport() +
                        " to " + flight.getArrivalAirport() + " is possible");
            } else {
                System.out.println("Flight from " + flight.getDepartureAirport() +
                        " to " + flight.getArrivalAirport() + " is impossible");
            }

        }

        return flights;

    }
}










        /*for(Map.Entry<String, Boolean> entry : flights.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();

            if(key.equals(flight.getArrivalAirport())  &&
            key.equals(flight.getDepartureAirport()) &&
                    value == true) {
                System.out.println("Flight from " + flight.getDepartureAirport() +
                        " to " + flight.getArrivalAirport() + " is possible");
            }
            if(key.equals(flight.getArrivalAirport()) &&
                    key.equals(flight.getDepartureAirport()) &&
                    value == false) {
                System.out.println("Flight from " + flight.getDepartureAirport() +
                        " to " + flight.getArrivalAirport() + " is impossible");
            }
            if(!key.equals(flight.getDepartureAirport()) || !key.equals(flight.getArrivalAirport())) {
                throw new RouteNotFoundException("Flight not found");
            }
        }
        if (flights.containsKey(flight.getDepartureAirport()) &&
                flights.containsKey(flight.getArrivalAirport())
                && flights.containsValue(true)) {
            System.out.println("Flight from " + flight.getDepartureAirport() +
                    " to " + flight.getArrivalAirport() + " is possible");
        }
        if (flights.containsKey(flight.getDepartureAirport()) &&
                flights.containsKey(flight.getArrivalAirport())
                && flights.containsValue(false)) {
            System.out.println("Flight from " + flight.getDepartureAirport() +
                    " to " + flight.getArrivalAirport() + " is impossible");
        }


        //throw new RouteNotFoundException("Flight not found");
        return flights;
    }
}*/
