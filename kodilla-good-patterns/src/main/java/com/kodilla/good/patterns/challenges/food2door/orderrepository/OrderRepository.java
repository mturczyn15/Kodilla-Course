package com.kodilla.good.patterns.challenges.food2door.orderrepository;

import com.kodilla.good.patterns.challenges.food2door.Product;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

public interface OrderRepository {

    boolean createOrder(Producer producer, int count, Product product, String address);
}
