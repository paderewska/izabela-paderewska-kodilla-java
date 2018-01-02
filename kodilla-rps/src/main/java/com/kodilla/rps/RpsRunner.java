package com.kodilla.rps;

public class RpsRunner {
    public static void main(String args[]){

       PlayerData playerData = new PlayerData();
       Rules rules = new Rules();

       //Przebieg gry
       playerData.writeName();
       rules.showTheRules();

    }
}
