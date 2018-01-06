package com.kodilla.exception.lotto;

import java.util.*;

public class Lotto {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeryUzytkownika = new HashSet<>();
        Set<Integer> numeryWylosowane = new HashSet<>();
        Random random = new Random();

        System.out.println("Wpisz 6 liczb z zakresu 1-49");

        while(numeryUzytkownika.size()<6){
            int podajLiczbe = scanner.nextInt();

            if(podajLiczbe>0 && podajLiczbe<50) {
                numeryUzytkownika.add(podajLiczbe);
            } else {
                System.out.println("Podaj liczbe z zakresu 1-49 glabie!)");
            }

        }
        System.out.println(numeryUzytkownika);

        while(numeryWylosowane.size()<6) {
            numeryWylosowane.add(random.nextInt(49)+1);
        }
        System.out.println(numeryWylosowane);

        int potrzebnaLiczba = 0;
        for(Integer zmiennaTymczasowa : numeryUzytkownika) {
            if(numeryWylosowane.contains(zmiennaTymczasowa)) {
                potrzebnaLiczba++;
            }
        }
        System.out.println(potrzebnaLiczba);
    }
}
