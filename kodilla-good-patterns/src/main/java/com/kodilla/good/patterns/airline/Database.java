package com.kodilla.good.patterns.airline;

import java.util.HashSet;

public class Database {

    Cities lodz = new Cities("Lodz");
    Cities warszawa = new Cities("Warszawa");
    Cities wroclaw = new Cities("Wroclaw");
    Cities poznan = new Cities("Poznan");

    public HashSet<Cities> citiesHashSet() {

        HashSet<Cities> flights = new HashSet<>();
        flights.add(lodz);
        flights.add(warszawa);
        flights.add(wroclaw);
        flights.add(poznan);

        lodz.addArrival(warszawa);
        lodz.addArrival(poznan);
        warszawa.addArrival(lodz);
        warszawa.addArrival(poznan);
        warszawa.addArrival(wroclaw);
        wroclaw.addArrival(warszawa);
        wroclaw.addArrival(poznan);
        poznan.addArrival(warszawa);
        poznan.addArrival(lodz);

        return flights;
    }
}
