package com.kodilla.rps;

public class TheRoundData {

    private int roundCounter;
    private int userChoice;
    private int computerChoice;
    private int userResult;
    private int computerResult;

    public TheRoundData(final int roundCounter, final int userChoice, final int computerChoice, final int userResult, final int computerResult) {
        this.roundCounter = roundCounter;
        this.userChoice = userChoice;
        this.computerChoice = computerChoice;
        this.userResult = userResult;
        this.computerResult = computerResult;
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public int getComputerChoice() {
        return computerChoice;
    }

    public int getUserResult() {
        return userResult;
    }

    public int getComputerResult() {
        return computerResult;
    }
}