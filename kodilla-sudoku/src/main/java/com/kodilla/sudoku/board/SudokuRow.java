package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.board.SudokuBoard.MAX;
import static com.kodilla.sudoku.board.SudokuBoard.MIN;

public class SudokuRow {

    SudokuBoard theBoard = new SudokuBoard();


    public List<SudokuElement> getTheRow(int rowNumber) {

        List<SudokuElement> theRow = new ArrayList<>();

        for (int n = 1; n < 10; n++) {
            theRow.add(theBoard.getElement(rowNumber, n));
        }

        return theRow;
    }

}
