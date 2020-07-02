package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private String name;
    private double prize;

    public Product(String name, double prize) {
        this.name = name;
        this.prize = prize;
    }

    @Override
    public String toString() {
        return name;
    }
}
