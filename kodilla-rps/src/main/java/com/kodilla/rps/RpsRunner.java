package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        PlayerData playerData = new PlayerData();
        Rules rules = new Rules();
        TheRound theRound = new TheRound();
        Summary summary = new Summary();
        TheEnd theEnd = new TheEnd();

        playerData.writeName();
        // rules.showTheRules();
        theRound.startTheRound();


    }
}
