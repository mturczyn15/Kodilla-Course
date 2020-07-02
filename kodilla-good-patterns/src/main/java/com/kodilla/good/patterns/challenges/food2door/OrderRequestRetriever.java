package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producer.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

public class OrderRequestRetriever {

    public OrderRequest retrieve () {
        Producer producer = new HealthyShop();
        int count = 1;
        Product pizza = new Product("Pizza 40 cm", 50.0);
        String address = "Chełm 12/105";
        return new OrderRequest(producer, count, pizza, address);
    }
}
