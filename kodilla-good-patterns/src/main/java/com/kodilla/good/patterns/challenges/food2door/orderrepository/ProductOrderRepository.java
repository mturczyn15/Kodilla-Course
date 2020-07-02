package com.kodilla.good.patterns.challenges.food2door.orderrepository;

import com.kodilla.good.patterns.challenges.food2door.Product;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

public class ProductOrderRepository implements  OrderRepository{

    @Override
    public boolean createOrder(Producer producer, int count, Product product, String address) {
        return true;
    }
}
