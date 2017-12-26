package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;


public final class World {

    private final List<Continent> theListOfContinents;

    public World(List<Continent> theListOfContinents) {
        this.theListOfContinents = theListOfContinents;
    }

    public List<Continent> getTheListOfContinents() {
        return theListOfContinents;
    }

    public BigDecimal getPeopleQuantity(List<Continent> list) {
        return list.stream()
                .flatMap(countries -> countries.getListOfCountries().stream())
                .map(quantity -> quantity.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return Objects.equals(theListOfContinents, world.theListOfContinents);
    }
}