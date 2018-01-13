package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static HashMap<Integer, String> gameBase = new HashMap<>();

    static {
        gameBase.put(1, "Kamień");
        gameBase.put(2, "Papier");
        gameBase.put(3, "Nożyce");
    }

    public static HashMap<Integer, String> getGameBase() {
        return gameBase;
    }
}
