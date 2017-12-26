package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {

    private final String continent;
    private final Country country;
    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent(String continent, Country country) {
        this.continent = continent;
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public Country getCountry() {
        return country;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent1 = (Continent) o;
        return Objects.equals(continent, continent1.continent) &&
                Objects.equals(country, continent1.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(continent, country);
    }
}
