package com.kodilla.good.patterns.challenges.airport.searcher;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    private final List<Flight> flightList;

    public FlightSearcher(List<Flight> flightList) {
        this.flightList = flightList;
    }

    String findFlightFromCity(String airport) throws RouteNotFoundException {

        if (airport != null ) {
            return flightList.stream()
                    .filter(a -> a.getDepartureAirport().equals(airport))
                    .map(Flight::toString)
                    .collect(Collectors.joining("\n", "", ""));

        } else {
            throw new RouteNotFoundException("You entered bad airport!!");
        }
    }

    String findFlightToCity(String airport) throws RouteNotFoundException {

        if (airport != null) {
            return flightList.stream()
                    .filter(a -> a.getArrivalAirport().equals(airport))
                    .map(Flight::toString)
                    .collect(Collectors.joining("\n", "", ""));

        } else {
            throw new RouteNotFoundException("You entered bad airport!!");
        }
    }

    String findFlightThrowCity(String fromAirport, String toAirport) throws RouteNotFoundException {

        if (fromAirport != null || toAirport!= null) {
            return flightList.stream()
                    .filter(flight -> flight.getDepartureAirport().equals(fromAirport))
                    .map(Flight::getArrivalAirport)
                    .filter(city -> flightList.stream()
                            .filter(flight -> flight.getArrivalAirport().equals(toAirport))
                            .map(Flight::getDepartureAirport)
                            .anyMatch(c -> c.equals(city)))
                    .collect(Collectors.joining("\n",   fromAirport + " -> ", " -> " + toAirport));

        } else {
            throw new RouteNotFoundException("You entered bad airport!!");
        }
    }
}