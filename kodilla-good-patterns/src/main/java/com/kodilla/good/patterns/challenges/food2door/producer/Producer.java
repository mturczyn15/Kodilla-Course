package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.Product;

public interface Producer {

    boolean process(Producer producer, int count, Product product, String address);
    String toString();
}
