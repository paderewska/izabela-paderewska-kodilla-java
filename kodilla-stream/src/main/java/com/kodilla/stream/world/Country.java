package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String country;
    private final String quantityOfPeople;

    public Country(String country, String quantityOfPeople) {
        this.country = country;
        this.quantityOfPeople = quantityOfPeople;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal(getQuantityOfPeople());
        return peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public String getQuantityOfPeople() {
        return quantityOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country);
    }
}