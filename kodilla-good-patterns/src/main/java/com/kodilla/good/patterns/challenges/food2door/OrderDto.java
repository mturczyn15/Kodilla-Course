package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    private boolean ordered;
    private String address;

    public OrderDto(boolean ordered, String address) {
        this.ordered = ordered;
        this.address = address;
    }

    public OrderDto(boolean ordered) {
        this.ordered = ordered;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public String getAddress() {
        return address;
    }
}
