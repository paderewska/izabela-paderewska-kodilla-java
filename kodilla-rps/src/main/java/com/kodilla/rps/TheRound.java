package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class TheRound {

    int playerChoice;

    Scanner sc = new Scanner(System.in);
    Random computerChoice = new Random();

    public void theRound(){
        System.out.println("Papier (1), Kamien (2) czy Nozyce(3)?");

        playerChoice = sc.nextInt();


        System.out.println();




    }
}
