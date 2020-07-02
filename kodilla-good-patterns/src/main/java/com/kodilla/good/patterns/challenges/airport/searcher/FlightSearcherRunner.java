package com.kodilla.good.patterns.challenges.airport.searcher;

import java.util.List;

public class FlightSearcherRunner {

    public static void main(String[] args) {

        FlightsList flightsList = new FlightsList();
        FlightSearcher flightSearcher = new FlightSearcher(flightsList.getFlightsList());

        try {
            System.out.println(flightSearcher.findFlightFromCity("Chelm"));
            System.out.println(flightSearcher.findFlightToCity("Chelm"));
            System.out.println(flightSearcher.findFlightThrowCity("London", "Gdynia"));

        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showResult(List<?> list) {
        System.out.println("");
        list.forEach(System.out::println);
    }
}
