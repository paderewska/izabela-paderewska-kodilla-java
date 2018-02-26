package com.kodilla.sudoku.choice;

import java.util.Scanner;

public class InputTheChoice {

    public TheChoice inputTheData(Scanner scanner) {

        int row;
        int column;
        int value;

        System.out.println("Wpisz nr wiersza (1-9)");
        row = scanner.nextInt();
        while(row>9 || row<1){
            System.out.println("Nieprawidlowa liczba! Wybierz od 1 do 9");
            row = scanner.nextInt();
        }
        System.out.println("Wpisz nr kolumny (1-9)");
        column = scanner.nextInt();
        while(column>9 || column<1){
            System.out.println("Nieprawidlowa liczba! Wybierz od 1 do 9");
            column = scanner.nextInt();
        }
        System.out.println("Wpisz wartosc pola (1-9)");
        value = scanner.nextInt();
        while(value>9 || value<1) {
            System.out.println("Nieprawidlowa liczba! Wybierz od 1 do 9");
            value = scanner.nextInt();
        }
        return new TheChoice(row, column, value);
    }
}
