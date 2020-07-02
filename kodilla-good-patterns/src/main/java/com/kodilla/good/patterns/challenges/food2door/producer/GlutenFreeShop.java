package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.Product;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Producer producer, int count, Product product, String address) {
        System.out.println("You succesfully bought product in  GlutenFreeShop");
        return true;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
