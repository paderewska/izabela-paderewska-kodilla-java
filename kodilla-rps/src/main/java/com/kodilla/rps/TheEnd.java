package com.kodilla.rps;

import java.util.Scanner;

public class TheEnd {

    private String theEndChoice = "nic";

    public void whatNext(Scanner sc) {

        System.out.println("\nWpisz x, jesli chcesz zakonczyc gre");
        System.out.println("Wpisz n, jesli chcesz rozpoczac gre jeszcze raz");

        sc.nextLine();
        theEndChoice = sc.nextLine();
    }

    public String getTheEndChar() {
        return theEndChoice;
    }
}