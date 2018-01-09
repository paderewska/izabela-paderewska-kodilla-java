package com.kodilla.good.patterns.airline;

public class RequestInformation {

    public int userChoice;
    public String city;

    public RequestInformation(final int userChoice, final String city) {
        this.userChoice = userChoice;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public int getUserChoice() {
        return userChoice;
    }
}
