package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;

public final class Continent {

    private final List<Country> listOfCountries;

    public Continent(List<Country> listOfCountries) {
        this.listOfCountries = listOfCountries;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(listOfCountries, continent.listOfCountries);
    }
}