package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Continent {

    private final List<Country> countriesList;

    public Continent(Country...countries) {
        countriesList = Arrays.asList(countries);
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countriesList);
    }
}
