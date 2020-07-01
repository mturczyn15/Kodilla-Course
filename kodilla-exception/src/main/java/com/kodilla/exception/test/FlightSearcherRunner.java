package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcherRunner {

    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher(initAirportMap());
        try {
            flightSearcher.findFlight(new Flight("Chelm", "Warsaw"));
            flightSearcher.findFlight(new Flight("London", "Chelm"));
            flightSearcher.findFlight(new Flight("Barcelona", "Bagdad"));
        } catch (RouteNotFoundException e) {
            System.out.println("That airport no exist, pls check other");
        }
    }

    private static Map<String, Boolean> initAirportMap() {

        Map<String, Boolean> AirportMap = new HashMap<>();

        AirportMap.put("Warsaw",true);
        AirportMap.put("Chelm",false);
        AirportMap.put("Cracow",true);
        AirportMap.put("Rzeszow",false);
        AirportMap.put("Radom",true);
        AirportMap.put("Lodz",false);
        AirportMap.put("Zakopane",true);
        AirportMap.put("Gdynia",true);
        return AirportMap;
    }
}
