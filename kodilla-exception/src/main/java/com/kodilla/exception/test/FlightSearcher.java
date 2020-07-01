package com.kodilla.exception.test;

import java.util.Map;

public class FlightSearcher {

    private final Map<String, Boolean> airportMap;

    public FlightSearcher(Map<String, Boolean> flightMap) {
        this.airportMap = flightMap;
    }

    void findFlight(Flight flight) throws RouteNotFoundException {

        if((flight.getArrivalAirport() != null) && airportMap.containsKey(flight.getArrivalAirport())) {
            if(airportMap.get(flight.getArrivalAirport())) {
                System.out.println("Flight is available");
            }else {
                System.out.println("No flights.");
            }
        } else  throw new RouteNotFoundException("No such airport");
    }
}
