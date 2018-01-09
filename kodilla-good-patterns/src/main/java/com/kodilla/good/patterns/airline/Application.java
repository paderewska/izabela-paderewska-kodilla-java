package com.kodilla.good.patterns.airline;

import java.util.HashMap;

public class Application {
    public static void main(String args[]) {

        PutTheData putTheData = new PutTheData();
        RequestInformation requestInformation = putTheData.choice();
        SearchinTypeList searchinTypeList = new SearchinTypeList();
        HashMap<Integer, FindTheFlight> theList = searchinTypeList.getTheSearchingType();

        FlightInformationService flightInformationService = new FlightInformationService(theList.get(requestInformation.getUserChoice()));

        System.out.println("\nWynik wyszukiwania:");
        flightInformationService.process(requestInformation);

    }
}