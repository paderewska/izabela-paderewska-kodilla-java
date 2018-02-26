package com.kodilla.sudoku.choice;

public class TheChoice {

    private int row;
    private int column;
    private int value;

    public TheChoice(final int row, final int column, final int value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }


    public int getValue() {
        return value;
    }
}
