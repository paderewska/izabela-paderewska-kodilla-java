package com.kodilla.good.patterns.airline;

import java.util.Scanner;
public class PutTheData {

    Scanner scanner = new Scanner(System.in);
    private String city;
    private int userChoice;

    public RequestInformation choice(){
        System.out.println("Wybierz opcje wybierajac liczbe 1, 2 lub 3");
        System.out.println("1 - Znalezienie wszystkich lotów z podanego miasta");
        System.out.println("2 - Znalezienie wszystkich lotów do danego miasta");
        System.out.println("3 - Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia");
        userChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wybierz miasto: Warszawa, Lodz, Wroclaw, Poznan");
        city = scanner.nextLine();
        scanner.close();

        return new RequestInformation(userChoice, city);
    }
}
