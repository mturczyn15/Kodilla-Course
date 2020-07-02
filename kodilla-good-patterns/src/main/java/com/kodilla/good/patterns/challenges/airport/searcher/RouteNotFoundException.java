package com.kodilla.good.patterns.challenges.airport.searcher;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(final String message) {
        super(message);
    }
}
