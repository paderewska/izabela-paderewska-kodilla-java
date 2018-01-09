package com.kodilla.good.patterns.airline;

public class FlightTo implements FindTheFlight {

    Database database = new Database();

    public void findTheFlight(RequestInformation requestInformation) {
        Cities city = new Cities((requestInformation.getCity()));

        database.citiesHashSet().stream()
                .filter(t -> t.getFlights().contains(city))
                .map(p -> p.getCity())
                .forEach(System.out::println);
    }
}
