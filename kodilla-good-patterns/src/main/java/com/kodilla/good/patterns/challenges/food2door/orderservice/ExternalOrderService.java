package com.kodilla.good.patterns.challenges.food2door.orderservice;

import com.kodilla.good.patterns.challenges.food2door.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

public class ExternalOrderService implements OrderService {

    private Producer producer;

    public ExternalOrderService(Producer producer) {
        this.producer = producer;
    }


    @Override
    public boolean order(OrderRequest orderRequest) {

        return producer.process(orderRequest.getProducer(), orderRequest.getCount(), orderRequest.getProduct(), orderRequest.getAddress());
    }
}
