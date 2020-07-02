package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.Product;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(Producer producer, int count, Product product, String address) {
        System.out.println("You succesfully bought product in  ExtraFoodShop. You pay for it 50 PLN");
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
