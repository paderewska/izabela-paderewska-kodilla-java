package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    List<String> ingredients;

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {

            if(!(roll.equals("bulka sezamowa") || roll.equals("bulka zwykla"))) {
                throw new IllegalStateException("Wpisz bulka sezomowa lub bulka zwykla");
            }
            if(burgers < 1 || burgers > 6) {
                throw new IllegalStateException("Wybierz liczbe kotletow wolowych z zakresu 1-6!");
            }
            if(!(sauce.equals("standard") || sauce.equals("1000 wysp") || sauce.equals("barbecue"))) {
                throw new IllegalStateException("Nieprawidlowo wybrany sos! Wybierz jeden z: standard, 1000 wysp, barbecue");
            }
            if(ingredients.size() < 1 || ingredients.size() >9) {
                throw new IllegalStateException("Minimum jeden dodatek, maksimum 10!");
            }

            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }

    private BigMac(final String roll, final int burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
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
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}