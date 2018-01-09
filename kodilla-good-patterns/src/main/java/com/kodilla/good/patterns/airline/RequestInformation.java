package com.kodilla.good.patterns.airline;

public class RequestInformation {

    private int userChoice;
    private String city;
    private String city2;

    public RequestInformation(final int userChoice, final String city, final String city2) {
        this.userChoice = userChoice;
        this.city = city;
        this.city2 = city2;
    }

    public String getCity() {
        return city;
    }

    public String getCity2() {
        return city2;
    }

    public int getUserChoice() {
        return userChoice;
    }
}
