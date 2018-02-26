package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuRow;
import com.kodilla.sudoku.solver.SimplySolver;

import java.util.Scanner;

public class SudokuApplication {

    public static void main(String[] args) {

        boolean gameFinished = false;
        Scanner scanner = new Scanner(System.in);

        while(!gameFinished) {

            System.out.println("Witaj w Sudoku-Solver!");
            System.out.println("Twoja tablica wyglada tak:");

            SudokuBoard theBoard = new SudokuBoard();
            System.out.println(theBoard.toString());

            SimplySolver simplySolver = new SimplySolver();
            System.out.println(simplySolver.solver());

            SudokuRow sudokuRow = new SudokuRow();

            for(int n=1; n<10; n++) {
            System.out.println(sudokuRow.getTheRow(1).get(n).getValue());
            }

            gameFinished = true;
            //petla wykonuje sie tak dlugo, jak dlugo uzytkownik chce rozwiazywac
            // kolejne sudoku
        }
    }
}
