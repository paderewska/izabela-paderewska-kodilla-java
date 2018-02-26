package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;
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


            gameFinished = true;
            //petla wykonuje sie tak dlugo, jak dlugo uzytkownik chce rozwiazywac
            // kolejne sudoku
        }
    }
}
