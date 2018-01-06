package com.kodilla.rps;

import java.util.Scanner;

public class PlayerData {

    private String name;
    private int winNumber;

    Scanner sc = new Scanner(System.in);

    public void writeName(){
        System.out.println("Wpisz swoje imie");
        name = sc.nextLine();
        System.out.println("Wpisz do ilu zwyciestw grasz");
        winNumber = sc.nextInt();
        sc.close();
    }

    public String getName() {
        return name;
    }

    public int getWinNumber() {
        return winNumber;
    }
}
