package com.kodilla.rps;

import java.util.Scanner;

public class PutTheData {

    public PlayerData writeName(Scanner sc) {

        String name;
        int winNumber;

        System.out.println("Wpisz swoje imie");
        name = sc.nextLine();
        System.out.println("Wpisz do ilu zwyciestw grasz");
        winNumber = sc.nextInt();

        System.out.println("\nZaczynamy gre!\n");
        System.out.println("Zasady gry:");
        System.out.println("klawisz 1 - zagranie \"kamień\"");
        System.out.println("klawisz 2 - zagranie \"papier\"");
        System.out.println("klawisz 3 - zagranie \"nożyce\"");
        System.out.println("klawisz x - zakończenie gry");
        System.out.println("klawisz n - uruchomienie gry od nowa");

        return new PlayerData(name, winNumber);
    }
}