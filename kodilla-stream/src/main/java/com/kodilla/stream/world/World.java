package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {

    private final List<Continent> theListOfContinents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(List<Continent> list) {
        return list.stream()
                .flatMap(countries -> countries.getListOfCountries().stream())
                .map(quantity -> quantity.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
