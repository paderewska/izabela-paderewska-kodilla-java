package com.kodilla.good.patterns.airline;

public class FlightBetween implements FindTheFlight {

    Database database = new Database();

    @Override
    public void findTheFlight(RequestInformation requestInformation) {
        Cities city = new Cities((requestInformation.getCity()));
        Cities city2 = new Cities((requestInformation.getCity2()));

        long direct = database.citiesHashSet().stream()
                .filter(t -> t.equals(city))
                .flatMap(s -> s.getFlights().stream())
                .filter(d -> d.equals(city2))
                .map(d -> d.getCity())
                .count();

        if (direct == 1) {
            System.out.println("Istnieje polaczenie bezposrednie z " + requestInformation.getCity() + " do " + requestInformation.getCity2());
        } else {
            System.out.println("Nie ma bezposredniego polaczenia z " + requestInformation.getCity() + " do " + requestInformation.getCity2());
        }


        long indirect = database.citiesHashSet().stream()
                .filter(t -> t.equals(city))
                .flatMap(s -> s.getFlights().stream())
                .flatMap(r -> r.getFlights().stream())
                .filter(d -> d.equals(city2))
                .map(d -> d.getCity())
                .count();

        if (indirect >= 1) {
            System.out.println("Liczba polaczen z przesiadka w innym miescie z " + requestInformation.getCity() + " do " + requestInformation.getCity2() + " wynosi " + indirect);
        } else {
            System.out.println("Nie ma polaczen z przesiadka w innym miescie z " + requestInformation.getCity() + " do " + requestInformation.getCity2());
        }

    }
}
