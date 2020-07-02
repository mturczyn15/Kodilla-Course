package com.kodilla.good.patterns.challenges.service.orderservice;

import com.kodilla.good.patterns.challenges.service.User;

public class ProductOrderService implements OrderService {


    @Override
    public boolean order(User user, String product, int count, double prize) {

        System.out.println(count + " piece of " + product + ", sold to: " + user.toString() +  " for " + prize + " PLN.");
        return true;
    }
}
