package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Scanner;

public class PurchasePutData {

    public Purchase order() {
        System.out.println("Wpisz imie i nazwisko zamawiajacego");
        Scanner scanner = new Scanner(System.in);
                User user = new User(scanner.nextLine(), scanner.nextLine());
        LocalDate data = LocalDate.now();

        scanner.close();
        return new Purchase(user, data);
    }
}
