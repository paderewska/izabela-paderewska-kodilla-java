package com.kodilla.rps;

public class PlayerData {

    private String name;
    private int winNumber;

    public PlayerData(final String name, final int winNumber) {
        this.name = name;
        this.winNumber = winNumber;
    }

    public String getName() {
        return name;
    }

    public int getWinNumber() {
        return winNumber;
    }
}