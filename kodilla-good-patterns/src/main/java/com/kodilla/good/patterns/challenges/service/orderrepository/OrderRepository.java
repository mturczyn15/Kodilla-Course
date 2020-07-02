package com.kodilla.good.patterns.challenges.service.orderrepository;

import com.kodilla.good.patterns.challenges.service.User;

public interface OrderRepository {

    boolean createOrder(User user, String product, int count, double prize);
}
