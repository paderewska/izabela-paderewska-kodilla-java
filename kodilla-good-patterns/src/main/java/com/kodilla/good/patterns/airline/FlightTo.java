package com.kodilla.good.patterns.airline;

public class FlightTo implements FindTheFlight {

    public void findTheFlight(RequestInformation requestInformation) {
        Cities city = new Cities((requestInformation.getCity()));

        System.out.println("bede myslec");
    }
}
