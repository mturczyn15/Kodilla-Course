package com.kodilla.good.patterns.challenges.service.orderrepository;

import com.kodilla.good.patterns.challenges.service.User;

public class ProductOrderRepository implements  OrderRepository{


    @Override
    public boolean createOrder(User user, String product, int count, double prize) {
        return true;
    }
}
