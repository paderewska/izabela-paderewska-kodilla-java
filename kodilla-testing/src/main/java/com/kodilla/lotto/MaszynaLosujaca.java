package com.kodilla.lotto;

import java.util.ArrayList;

public class MaszynaLosujaca{
    private Database database;

    public MaszynaLosujaca(Database database) {
        this.database = database;
    }

    public int miniLotto(ArrayList<Integer> liczbyUzytkownika) {

        ArrayList<Integer> computer = (ArrayList<Integer>) database.wylosuj(5);

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<5; i++) {
            if (liczbyUzytkownika.contains(computer.get(i))) {
                result.add(i);
            }
        }
        return result.size();
    }

}
