package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String args[]){

        FlightSearching flightSearching = new FlightSearching();
        Flight flight1 = new Flight("Chopin", "Chopin");

        try {
;       flightSearching.findFlight(flight1);

        } catch (RouteNotFoundException e) {
            System.out.println("Niestety nie znalezionio podanych lotnisk");

        } finally {
            System.out.println("Wyszukiwanie zakonczono");
        }
    }
}
