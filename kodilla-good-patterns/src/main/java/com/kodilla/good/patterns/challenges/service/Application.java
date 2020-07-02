package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.service.informationservice.MailService;
import com.kodilla.good.patterns.challenges.service.orderrepository.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.service.orderservice.ProductOrderService;

public class Application {
    public static void main(String[] args) {
        OrderRequest retrieve = new OrderRequestRetriever().retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(retrieve);
    }
}
