package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching  {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Chopin", true);
        airport.put("Lublinek", false);

        String airport1 = flight.departureAirport;
        String airport2 = flight.arrivalAirport;

        if (airport.containsKey(airport1) && airport.containsKey(airport2)) {
            System.out.println("Lotnisko " + airport1 + " mozliwosc odlotu: " + airport.get(airport1));
            System.out.println("Lotnisko " + airport2 + " mozliwosc przylotu: " + airport.get(airport2));
        }
        throw new RouteNotFoundException("Nie znaleziono wyszukiwanego lotniska");
    }

}
