package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class World {
    private final List<Continent> continentsList;

    public World(Continent...continents) {
        this.continentsList = Arrays.asList(continents);
    }

    public List<Continent> getContinentList() {
        return new ArrayList<>(continentsList);
    }

    public BigInteger getPeopleQuantity() {

        return getContinentList().stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
