package com.kodilla.good.patterns.fruits;

import java.util.Scanner;

public class PutTheData {

    Scanner scanner = new Scanner(System.in);

    private int supplier;
    private int productNumber;
    private String productName;

    public OrderInformation orderInformation() {

        System.out.println("Wybierz dostawce przez wybranie liczby 1, 2 lub 3");
        System.out.println("1 - Healthy Shop");
        System.out.println("2 - Gluten Free Shop");
        System.out.println("3 - Extra Food Shop");
        supplier = scanner.nextInt();
        System.out.println("Ile sztuk produktu?");
        productNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Jaki produkt?");
        productName = scanner.nextLine();

        scanner.close();

        return new OrderInformation(supplier, productNumber, productName);
    }
}

