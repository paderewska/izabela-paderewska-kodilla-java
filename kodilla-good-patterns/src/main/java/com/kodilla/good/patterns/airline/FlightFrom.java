package com.kodilla.good.patterns.airline;

public class FlightFrom implements FindTheFlight {

    Database database = new Database();

    public void findTheFlight(RequestInformation requestInformation) {
        Cities city = new Cities((requestInformation.getCity()));

        database.citiesHashSet().stream()
                .filter(t -> t.equals(city))
                .flatMap(s -> s.getFlights().stream())
                .map(s -> s.getCity())
                .forEach(System.out::println);
    }
}
