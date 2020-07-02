package com.kodilla.good.patterns.challenges.food2door;


import com.kodilla.good.patterns.challenges.food2door.orderrepository.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.food2door.orderservice.ExternalOrderService;

public class Application {
    public static void main(String[] args) {
        OrderRequest request = new OrderRequestRetriever().retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new ExternalOrderService(request.getProducer()), new ProductOrderRepository());
        orderProcessor.process(request);
    }
}
