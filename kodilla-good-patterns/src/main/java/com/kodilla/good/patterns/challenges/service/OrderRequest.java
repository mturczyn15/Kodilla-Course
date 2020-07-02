package com.kodilla.good.patterns.challenges.service;

public class OrderRequest {

    private User user;
    private String product;
    private int count;
    private double prize;


    public OrderRequest(User user, String product, int count, double prize) {
        this.user = user;
        this.product = product;
        this.count = count;
        this.prize = prize;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

    public double getPrize() {
        return prize;
    }
}
