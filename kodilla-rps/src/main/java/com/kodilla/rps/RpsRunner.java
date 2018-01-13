package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String args[]) {

        boolean endOrNotEnd = false;
        Scanner sc = new Scanner(System.in);

        while (!endOrNotEnd) {

            PutTheData putTheData = new PutTheData();
            PlayerData playerData = putTheData.writeName(sc);

            TheRound theRound = new TheRound();
            TheRoundData theRoundData = theRound.startTheRound(playerData, sc);

            Summary summary = new Summary();
            summary.afterFinishGame(playerData, theRoundData);

            TheEnd theEnd = new TheEnd();
            boolean ifTheEnd = theEnd.whatNext(sc);

            if (ifTheEnd) {
                endOrNotEnd = false;
            } else {
                endOrNotEnd = true;
            }
        }
        sc.close();
        System.out.println("Koniec gry. Do nastepnego razu!");
    }
}