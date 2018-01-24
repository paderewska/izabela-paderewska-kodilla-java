package com.kodilla.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

    public static Set<Integer> losowanko() {

        Random ramdomik = new Random();
        Set<Integer> jegoLista = new HashSet<>();

        while (jegoLista.size() < 6) {
            jegoLista.add(ramdomik.nextInt(49) + 1);
        }
        return jegoLista;
    }

    public static void main(String args[]) {


        Set<Integer> mojaLista = new HashSet<>();
        mojaLista.add(1);
        mojaLista.add(5);
        mojaLista.add(10);
        mojaLista.add(15);
        mojaLista.add(20);
        mojaLista.add(25);


        int licznik = 1;

        Set<Integer> jegoLista = losowanko();
        while (!mojaLista.equals(jegoLista)) {
            jegoLista = losowanko();
            licznik++;
        }
        System.out.println(licznik);

    }
}
