package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final Bun bun;
    private final Integer burgers;
    private final Sauce sauce;
    private final List<Ingredients> ingredients;

    public static class BigMacBuilder {
        private Bun bun = Bun.EMPTY;
        private Integer burgers = null;
        private Sauce sauce = Sauce.EMPTY;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigMacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            if (sauce == Sauce.EMPTY) {
                throw new IllegalStateException("There is no sauce specified!");
            }
            if (bun == Bun.EMPTY) {
                throw new IllegalStateException("There is no bun specified!");
            }
            if (burgers == null) {
                throw new IllegalStateException("There is no burgers specified!");
            }
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    private BigMac(final Bun bun, final Integer burgers,final Sauce sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}