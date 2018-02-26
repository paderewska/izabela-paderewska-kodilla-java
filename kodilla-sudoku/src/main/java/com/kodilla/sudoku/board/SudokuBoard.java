package com.kodilla.sudoku.board;

public class SudokuBoard {

    public final static int MIN = 0;
    public final static int MAX = 8;

    SudokuElement[][] board = new SudokuElement[9][];

    public SudokuBoard() {
        for(int n=0; n<9; n++) {
            board[n] = new SudokuElement[9];
        }
    }

    public SudokuElement getElement(int row, int column) {
        return board[row][column];
    }

    public void setElement(int row, int column, SudokuElement sudokuElement) {
        board[row-1][column-1] = sudokuElement;
    }

    @Override
    public String toString() {

        String result = "";
        for(int n = MIN; n<=MAX; n++) {
            result += "|";
            for(int k=MIN; k<=MAX; k++) {
                if(board[n][k] == null) {
                    result += "_";
                } else {
                    result +=(board[n][k].getValue());
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }

    /*public List<SudokuElement> getElements() {
        return theBoard.stream()
                .flatMap(n -> n.getTheRow().stream())
                .collect(Collectors.toList());
    } */


    //public SudokuElement Board() {

       //return theBoard.stream()
        //       .flatMap(n -> n.getTheRow().stream())
          //     .distinct();
    //}

    // Stream<SudokuElement> elementStream = theBoard.flatMap(Collection::stream);

}
