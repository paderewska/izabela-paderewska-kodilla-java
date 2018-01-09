package com.kodilla.good.patterns.airline;

public class FlightInformationService {

    private FindTheFlight findTheFlight;

    public FlightInformationService(final FindTheFlight findTheFlight) {
        this.findTheFlight = findTheFlight;
    }

    public void process (RequestInformation requestInformation) {

        findTheFlight.findTheFlight(requestInformation);
    }
}
