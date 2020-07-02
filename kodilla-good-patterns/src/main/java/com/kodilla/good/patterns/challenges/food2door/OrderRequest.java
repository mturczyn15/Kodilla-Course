package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

public class OrderRequest {

    private Producer producer;
    private int count;
    private Product product;
    private String address;

    public OrderRequest(Producer producer, int count, Product product, String address) {
        this.producer = producer;
        this.count = count;
        this.product = product;
        this.address = address;
    }

    public Producer getProducer() {
        return producer;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

    public String getAddress() {
        return address;
    }


}
