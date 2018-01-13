package com.kodilla.rps;

import java.util.Scanner;

public class TheEnd {

    public boolean whatNext(Scanner sc) {

        boolean theEndChoice = false;
        System.out.println("\nWpisz x, jesli chcesz zakonczyc gre");
        System.out.println("Wpisz n, jesli chcesz rozpoczac gre jeszcze raz");

        sc.nextLine();
        String x = sc.nextLine();

        if (x.equals("n")) {
            theEndChoice = true;
        }
        return theEndChoice;
    }
}