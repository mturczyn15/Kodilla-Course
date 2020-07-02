package com.kodilla.good.patterns.challenges.service.orderservice;

import com.kodilla.good.patterns.challenges.service.User;

public interface OrderService {

    boolean order(User user, String product, int count, double prize);
}
