package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class TheRound {

    private boolean end = false;
    private int roundCounter = 0;
    private int userChoice = 0;
    private int computerChoice = 0;
    private int userResult = 0;
    private int computerResult = 0;


    public TheRoundData startTheRound(PlayerData playerData, Scanner sc) {

        Random rdm = new Random();

        PutTheData putTheData = new PutTheData();
        Database database = new Database();

        while (!end) {
            System.out.println("\nWykonaj ruch - wybierz liczbe 1, 2 lub 3");
            System.out.println("Papier (1) Kamien (2) Nozyce(3)");

            userChoice = sc.nextInt();
            computerChoice = rdm.nextInt(3) + 1;

            if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {

                userResult++;
                System.out.println("Wygrales runde!");
                System.out.println("Twoj wybor to: " + Database.getGameBase().get(userChoice));
                System.out.println("Wybor komputera to: " + Database.getGameBase().get(computerChoice));
                System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + userResult + " - " + computerResult);
            } else if ((userChoice == 1 && computerChoice == 2) || (userChoice == 2 && computerChoice == 3) || (userChoice == 3 && computerChoice == 1)) {

                computerResult++;
                System.out.println("Przegrales runde!");
                System.out.println("Twoj wybor to: " + Database.getGameBase().get(userChoice));
                System.out.println("Wybor komputera to: " + Database.getGameBase().get(computerChoice));
                System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + userResult + " - " + computerResult);
            } else if (userChoice == computerChoice) {
                System.out.println("Wybraliscie to samo - nikt nie wygral rundy");
                System.out.println("Twoj wybor to: " + Database.getGameBase().get(userChoice));
                System.out.println("Wybor komputera to: " + Database.getGameBase().get(computerChoice));
                System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + userResult + " - " + computerResult);
            } else {
                System.out.println("Cos poszlo nie tak. Koniec gry");
            }

            roundCounter++;
            if (userResult == playerData.getWinNumber() || computerResult == playerData.getWinNumber()) {
                end = true;
            }
        }
        return new TheRoundData(roundCounter, userChoice, computerChoice, userResult, computerResult);
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public int getComputerResult() {
        return computerResult;
    }

    public int getUserResult() {
        return userResult;
    }
}