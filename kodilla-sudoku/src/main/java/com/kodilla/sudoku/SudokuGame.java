package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuElement;
import com.kodilla.sudoku.choice.InputTheChoice;
import com.kodilla.sudoku.choice.TheChoice;

import java.util.Scanner;

public class SudokuGame {

    public SudokuBoard oneGame(Scanner scanner) {

        String sudoku = "";
        SudokuBoard theBoard = new SudokuBoard();

        while (!(sudoku.equals("SUDOKU"))) {

            InputTheChoice dataInput = new InputTheChoice();
            TheChoice theChoice = dataInput.inputTheData(scanner);

            System.out.println("Twoja tablica wyglada teraz tak:");
            theBoard.setElement(theChoice.getRow(), theChoice.getColumn(), new SudokuElement(theChoice.getValue()));
            System.out.println(theBoard.toString());
            scanner.nextLine();
            System.out.println("Wpisz SUDOKU, jesli chcesz zobaczyc rozwiazanie lub kliknij ENTER aby kontynuowac wpisywanie");
            sudoku = scanner.nextLine();
        }

        return theBoard;
    }
}



    /*
    private final SudokuBoard board;

    private SudokuGame(SudokuBoard board) {
        this.board = board;
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public static class GameBuilder {
        private SudokuBoard board = new SudokuBoard();

    public GameBuilder SudokuElement(int x, int y, int elementValue) {

        DataInput dataInput = new DataInput();

        if(x>(SudokuBoard.MAX+1) || x<(SudokuBoard.MIN+1) ||
                y>(SudokuBoard.MAX+1) || y<(SudokuBoard.MIN+1)) {
            throw new IllegalStateException("Numer wiersza i kolumny powinny byc liczbami miedzy " + (SudokuBoard.MIN + 1) + " a " + (SudokuBoard.MAX + 1));
        }
        if (board.getElement(x, y) == null) {
            board.setElement(x, y);
        } else {
            throw new IllegalStateException("W pozycji " + x + ", " + y + " jest obecnie zajete");
        }
        return this;
    }
    }
    */


        //public boolean resolveSudoku() {

        //zwraca informacje o tym czy uzytkownik chce zrealizowac kolejne sudoku(zwraca wtedy true)
        //lub zakonczyc prace - zwraca false

        //   return true;


