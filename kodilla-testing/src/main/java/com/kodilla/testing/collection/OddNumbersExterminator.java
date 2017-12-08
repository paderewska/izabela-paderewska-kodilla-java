package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    ArrayList<Integer> newList = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer>list){
        int value = 0;
        for(int n=0; n<list.size(); n++){
            value = list.get(n);
            if(value%2==0){
                newList.add(value);
            }
        }
    }
}
