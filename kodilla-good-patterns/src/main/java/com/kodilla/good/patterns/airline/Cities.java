package com.kodilla.good.patterns.airline;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Cities {

    private final String city;
    private final Set<Cities> flights = new HashSet<>();

    public Cities(String city) {
        this.city = city;
    }

    public void addArrival(Cities city){
        flights.add(city);
    }

    public String getCity() {
        return city;
    }

    public Set<Cities> getFlights() {
        return flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return Objects.equals(city, cities.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(city);
    }
}
