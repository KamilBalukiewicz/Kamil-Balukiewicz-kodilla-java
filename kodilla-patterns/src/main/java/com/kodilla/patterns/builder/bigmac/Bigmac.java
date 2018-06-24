package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;


public final class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    public static class BigmacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredient ingredient) {
                ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final Bun bun, final int burgers, final Sauce sauce, final List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun.getBunType() +
                ", burgers=" + burgers +
                ", sauce='" + sauce.getSauceType() + '\'' +
                ", ingredients=" + ingredients.toString() +
                '}';
    }
}

/*public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals("plain") || bun.equals("sesame")) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Bun must be plain or sesame");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals("standard") || sauce.equals("1000islands") || sauce.equals("barbecue")) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Sauce can be standard or 1000islands or barbecue");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(ingredient.equals("lettuce") || ingredient.equals("onion") ||
                    ingredient.equals("bacon") || ingredient.equals("pickle") ||
                    ingredient.equals("chillies") || ingredient.equals("mushrooms") ||
                    ingredient.equals("prawns") || ingredient.equals("cheese")) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Additional ingredient may be LETTUCE or " +
                        "ONION or BACON or PICKLE or CHILLIES or MUSHROOMS or PRAWNS or CHEESE");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}*/
