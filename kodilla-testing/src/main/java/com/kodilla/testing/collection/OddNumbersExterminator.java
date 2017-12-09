package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> list) {
        int value = 0;
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int n = 0; n < list.size(); n++) {
            value = list.get(n);
            if (value % 2 == 0) {
                newList.add(value);
            }
        }
        return newList;
    }
}
