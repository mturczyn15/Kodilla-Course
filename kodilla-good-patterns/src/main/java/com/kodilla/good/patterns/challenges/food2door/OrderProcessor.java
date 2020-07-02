package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.orderrepository.OrderRepository;
import com.kodilla.good.patterns.challenges.food2door.orderservice.OrderService;

public class OrderProcessor {

    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService,
                          final OrderRepository orderRepository) {

        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean ordered = orderService.order(orderRequest);

        if(ordered) {
            orderRepository.createOrder(orderRequest.getProducer(),
                                        orderRequest.getCount(),
                                        orderRequest.getProduct(),
                                        orderRequest.getAddress());
            return new OrderDto(true, orderRequest.getAddress());
        } else {
            return new OrderDto(false);
        }
    }
}
