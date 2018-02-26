package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    private int value;
    public static int EMPTY = -1;

    public SudokuElement(int value) {
        this.value = value;
    }

    public List<Integer> getValueList() {

        List<Integer> valueList = new ArrayList<>();
        valueList.add(1);
        valueList.add(2);
        valueList.add(3);
        valueList.add(4);
        valueList.add(5);
        valueList.add(6);
        valueList.add(7);
        valueList.add(8);
        valueList.add(9);

        return valueList;
    }

    public int getValue() {
        return value;
    }
}
