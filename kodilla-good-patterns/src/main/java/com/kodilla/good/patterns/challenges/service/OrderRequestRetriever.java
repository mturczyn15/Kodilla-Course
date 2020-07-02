package com.kodilla.good.patterns.challenges.service;

public class OrderRequestRetriever {

    public OrderRequest retrieve () {
        User user = new User("John", "Wick");
        String product = "TV 42 cal";
        int count = 1;
        double prize = 1200.0;
        return new OrderRequest(user, product, count, prize);
    }
}
