package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class TheRound {

    PlayerData playerData = new PlayerData();

    Scanner sc = new Scanner(System.in);
    Random rdm = new Random();

        private boolean end = false;
        private int roundCounter = 0;
        public int userChoice;
        public int computerChoice;
        private int userResult = 0;
        private int computerResult = 0;


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

    public void startTheRound(){
        while (!end) {
            System.out.println("\nWykonaj ruch - wybierz liczbe 1, 2 lub 3");
            System.out.println("Papier (1) Kamien (2) Nozyce(3)");

            userChoice = sc.nextInt();
            computerChoice = rdm.nextInt(3) + 1;

            if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {

                userResult++;
                System.out.println("Wygrales runde!");
                System.out.println("Twoj wybor to: " + userChoice);
                System.out.println("Wybor komputera to: " + computerChoice);
                System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + userResult + " - " + computerResult);
            }

            if ((userChoice == 1 && computerChoice == 2) || (userChoice == 2 && computerChoice == 3) || (userChoice == 3 && computerChoice == 1)) {

                computerResult++;
                System.out.println("Przegrales runde!");
                System.out.println("Twoj wybor to: " + userChoice);
                System.out.println("Wybor komputera to: " + computerChoice);
                System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + userResult + " - " + computerResult);
            }

            if (userChoice == computerChoice) {
                System.out.println("Wybraliscie to samo - nikt nie wygral rundy");
                System.out.println("Twoj wybor to: " + userChoice);
                System.out.println("Wybor komputera to: " + computerChoice);
                System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + userResult + " - " + computerResult);
            }

            roundCounter++;
            if(userResult == playerData.getWinNumber()) {
                end = true;
            }
        }
    }
}
