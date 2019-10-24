/*
 * This program represents the board functionality
 */
package bathassgn2req3;

/**
 *
 * @author rahma
 */
import java.util.*;

/**
 * The board class
 */
public class Board {

    private final int column = 7;
    private final int row = 6;
    private char[][] board;

    /**
     * Default constructor
     */
    public Board() {
        board = new char[row][column];
    }

    /**
     * check diagonal wins
     *
     * @param color type
     * @return boolean
     */
    public boolean checkDiagonal(char color) {

        boolean hasWon = false;
        int count = 0;

        //top down left diagonal  
        for (int time = 0, diag = 0; time < board.length; time++, diag++) {
            if (board[time][diag] == color) {
                count = count + 1;
                if (count == 4) {

                    hasWon = true;
                    return hasWon;
                }
            } else {
                count = 0;
            }

        }

        //bottum up left diagonal
        for (int time = board.length - 1, diag = 0; time >= 0; time--, diag++) {
            if (board[time][diag] == color) {
                count = count + 1;
                if (count == 4) {
                    hasWon = true;
                    return hasWon;
                }
            } else {
                count = 0;
            }

        }

        //top down right diagonal
        for (int time = 0, diag = board[0].length - 1; time < board.length; time++, diag--) {
            if (board[time][diag] == color) {
                count = count + 1;
                if (count == 4) {
                    hasWon = true;
                    return hasWon;
                }
            } else {
                count = 0;
            }

        }
        //bottom up right diagonal
        for (int time = board.length - 1, diag = board[0].length - 1; time >= 0; time--, diag--) {
            if (board[time][diag] == color) {
                count = count + 1;
                if (count == 4) {
                    hasWon = true;
                    return hasWon;
                }
            } else {
                count = 0;
            }

        }

        return hasWon;
    }

    /**
     * check horizontal win
     *
     * @param color type
     * @return boolean
     */
    public boolean checkHorizontal(char color) {

        boolean hasWon = false;
        int count = 0;

        // check horizontal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == color) {
                    count = count + 1;

                    if (count == 4) {
                        hasWon = true;
                        return hasWon;

                    }
                } else {
                    count = 0;
                }
            }

        }

        return hasWon;
    }

    /**
     * check vertical win
     *
     * @param color type
     * @return boolean
     */
    public boolean checkVertical(char color) {

        boolean hasWon = false;
        int count = 0;

        // check horizontal
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == color) {
                    count = count + 1;

                    if (count == 4) {
                        hasWon = true;
                        return hasWon;

                    }
                } else {
                    count = 0;
                }
            }

        }

        return hasWon;
    }

    /**
     * sets the board
     *
     * @param row of board
     * @param col of board
     * @param move by player
     */
    public void setBoard(int row, int col, char move) {
        // TODO implement here
        this.board[row][col] = move;
    }

    /**
     * get the board
     *
     * @param row of board
     * @param col of board
     * @return board position
     */
    public char getBoard(int row, int col) {

        return board[row][col];

    }

    /**
     * @return column number
     */
    public int getColumn() {
        // TODO implement here
        return this.column;
    }

    /**
     * @return row number
     */
    public int getRow() {
        // TODO implement here
        return row;
    }

    /**
     * print the board
     */
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //player 1 , 2 and 3 if any    
                if (board[i][j] == 'r') {
                    System.out.print("| r ");
                } else if (board[i][j] == 'y') {
                    System.out.print("| y ");
                } else if (board[i][j] == 'b') {
                    System.out.print("| b ");
                } else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  1   2   3   4   5   6   7");

    }

}
