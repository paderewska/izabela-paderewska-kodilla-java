package com.kodilla.good.patterns.airline;

import java.util.HashMap;

public class SearchinTypeList {

    public HashMap<Integer, FindTheFlight> getTheSearchingType() {

        HashMap<Integer, FindTheFlight> theList = new HashMap<>();
        theList.put(1, new FlightFrom());
        theList.put(2, new FlightTo());
        theList.put(3, new FlightBetween());

        return theList;
    }
}
