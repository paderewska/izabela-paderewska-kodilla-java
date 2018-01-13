package com.kodilla.rps;

public class Summary {

    public void afterFinishGame(PlayerData playerData, TheRoundData theRoundData) {

        System.out.println("\nKoniec!");
        System.out.println("Liczba rund: " + theRoundData.getRoundCounter());
        System.out.println("Wynik gry: " + playerData.getName() + " vs komputer: " + theRoundData.getUserResult() + " - " + theRoundData.getComputerResult());

        if (theRoundData.getUserResult() > theRoundData.getComputerResult()) {
            System.out.println("Wygrana nalezy do Ciebie");
            System.out.println("Gratulacje! " + playerData.getName());

        } else {
            System.out.println("Wygrana nalezy do komputera");
            System.out.println("Prykro mi, ze maszyna jest lepsza od Ciebie :(");
        }
    }
}
