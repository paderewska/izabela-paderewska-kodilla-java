package com.kodilla.sudoku.board;

import com.kodilla.sudoku.board.SudokuElement;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> theRow = new ArrayList();

    public SudokuRow() {
    }

    public SudokuRow(List<SudokuElement> theRow) {
        this.theRow = theRow;
    }

    public List<SudokuElement> getTheRow() {
        return theRow;
    }
}
