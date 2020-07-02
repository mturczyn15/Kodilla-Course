package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.Product;

public class HealthyShop implements Producer{

    @Override
    public boolean process(Producer producer, int count, Product product, String address) {
        if (producer instanceof HealthyShop) {
            System.out.println("You succesfully bought " + count + " pieces of " + product + " in " + producer + " Address is: " + address);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Healthy Shop";
    }
}
