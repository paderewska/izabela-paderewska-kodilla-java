package com.kodilla.sudoku.solver;

import com.kodilla.sudoku.SudokuApplication;
import com.kodilla.sudoku.SudokuGame;
import com.kodilla.sudoku.board.SudokuBoard;

import java.util.Scanner;

public class SimplySolver {

    Scanner scanner = new Scanner(System.in);

    SudokuGame sudokuGame = new SudokuGame();
    SudokuApplication app = new SudokuApplication();
    SudokuBoard theBoard = sudokuGame.oneGame(scanner);

    public int solver() {


        theBoard.getElement(1,1).getValue();
        int cos = theBoard.getElement(1,1).getValue();
        System.out.println(cos);

        return cos;

        /*
        for (int n = 1; n < 10; n++) {
            for (int k = 1; k < 9; k++) {
                if (theBoard.getElement(n, k) == null) {
                    System.out.println("cos " + n + " " + k);
                } else {
                    System.out.println("dupa");
                }
            }
        }
    } */
    }
}