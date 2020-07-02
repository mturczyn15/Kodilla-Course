package com.kodilla.good.patterns.challenges.airport.searcher;

import java.util.ArrayList;
import java.util.List;

public final class FlightsList {

    public final List<Flight> getFlightsList() {

        final List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight("Chelm", "Warsow"));
        flightsList.add(new Flight("London", "Chelm"));
        flightsList.add(new Flight("Chelm", "London"));
        flightsList.add(new Flight("Barcelona", "Bagdad"));
        flightsList.add(new Flight("Barcelona", "Lleida"));
        flightsList.add(new Flight("Warsow", "Chelm"));
        flightsList.add(new Flight("Radom", "Wroclav"));
        flightsList.add(new Flight("Chelm", "Gdynia"));
        flightsList.add(new Flight("Chelm", "Torun"));
        return flightsList;
    }
}
