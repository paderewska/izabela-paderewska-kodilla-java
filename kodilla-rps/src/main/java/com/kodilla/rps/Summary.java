package com.kodilla.rps;

public class Summary {

    PlayerData playerData = new PlayerData();
    TheRound theRound = new TheRound();

    public void afterFinishGame() {

        System.out.println("\nKoniec!");
        System.out.println("Liczba rund: " + theRound.getRoundCounter());
        System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + theRound.getUserResult() + " - " + theRound.getComputerResult());

        if (theRound.getUserResult() > theRound.getComputerResult()) {
            System.out.println("Wygrana nalezy do Ciebie");
            System.out.println("Gratulacje! " + playerData.getName());

        } else {
            System.out.println("Wygrana nalezy do komputera");
            System.out.println("Prykro mi, ze maszyna jest lepsza od Ciebie :(");
        }
    }
}
