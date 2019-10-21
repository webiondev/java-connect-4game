package bathassgn2req3;

/**
 *
 * @author rahma
 */
import java.util.*;

/**
 *
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
     * check diagonal win
     *
     * @return boolean
     */
    public boolean checkDiagonal() {
        // TODO implement here
        boolean hasWon = false;
        int count1 = 0;
        int count2 = 0;
        //top down left diagonal  
        for (int time = 0, diag = 0; time < board.length; time++, diag++) {
            if (board[time][diag] == 'r') {
                count1 = count1 + 1;
                if (count1 == 4) {
                    hasWon = true;
                }
            } else {
                count1 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }

        //bottum up left diagonal
        for (int time = board.length - 1, diag = 0; time >= 0; time--, diag++) {
            if (board[time][diag] == 'r') {
                count1 = count1 + 1;
                if (count1 == 4) {
                    hasWon = true;
                }
            } else {
                count1 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }

        //top down right diagonal
        for (int time = 0, diag = board[0].length - 1; time < board.length; time++, diag--) {
            if (board[time][diag] == 'r') {
                count1 = count1 + 1;
                if (count1 == 4) {
                    hasWon = true;
                }
            } else {
                count1 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }
        //bottom up right diagonal
        for (int time = board.length - 1, diag = board[0].length - 1; time >= 0; time--, diag--) {
            if (board[time][diag] == 'r') {
                count1 = count1 + 1;
                if (count1 == 4) {
                    hasWon = true;
                }
            } else {
                count1 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }

        //top down left diagonal  
        for (int time = 0, diag = 0; time < board.length; time++, diag++) {
            if (board[time][diag] == 'y') {
                count2 = count2 + 1;
                if (count2 == 4) {
                    hasWon = true;
                }
            } else {
                count2 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }

        //bottum up left diagonal
        for (int time = board.length - 1, diag = 0; time >= 0; time--, diag++) {
            if (board[time][diag] == 'y') {
                count2 = count2 + 1;
                if (count2 == 4) {
                    hasWon = true;
                }
            } else {
                count2 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }

        //top down right diagonal
        for (int time = 0, diag = board[0].length - 1; time < board.length; time++, diag--) {
            if (board[time][diag] == 'y') {
                count2 = count2 + 1;
                if (count2 == 4) {
                    hasWon = true;
                }
            } else {
                count2 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }
        //bottom up right diagonal
        for (int time = board.length - 1, diag = board[0].length - 1; time >= 0; time--, diag--) {
            if (board[time][diag] == 'y') {
                count2 = count2 + 1;
                if (count2 == 4) {
                    hasWon = true;
                }
            } else {
                count2 = 0;
            }
            if (hasWon == true) {
                break;
            }
        }
        return hasWon;
    }

    /**
     * check horizontal win
     *
     * @return boolean
     */
    public boolean checkHorizontal() {
        // TODO implement here
        boolean hasWon = false;
        int count1 = 0;
        int count2 = 0;
        // check horizontal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'r') {
                    count1 = count1 + 1;

                    if (count1 == 4) {
                        hasWon = true;

                    }
                } else {
                    count1 = 0;
                }
            }
            if (hasWon == true) {
                break;
            }

        }

        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 'y') {
                    count2 = count2 + 1;
                    if (count2 == 4) {
                        hasWon = true;
                    }
                } else {
                    count2 = 0;
                }
            }
            if (hasWon == true) {
                break;
            }
        }

        return hasWon;
    }

    /**
     * check vertical win
     *
     * @return boolean
     */
    public boolean checkVertical() {
        // TODO implement here
         boolean hasWon = false;
        int count1 = 0;
        int count2 = 0;
        // check horizontal
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 'r') {
                    count1 = count1 + 1;

                    if (count1 == 4) {
                        hasWon = true;

                    }
                } else {
                    count1 = 0;
                }
            }
            if (hasWon == true) {
                break;
            }

        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'y') {
                    count2 = count2 + 1;
                    if (count2 == 4) {
                        hasWon = true;
                    }
                } else {
                    count2 = 0;
                }
            }
            if (hasWon == true) {
                break;
            }
        }

        return hasWon;
    }

    /**
     * sets the board
     *
     * @param board
     */
    public void setBoard(int row, int col, char move) {
        // TODO implement here
        this.board[row][col] = move;
    }

    /**
     * get the board
     *
     * @return char array
     */
    public char getBoard(int row, int col) {
        // TODO implement here
        return board[row][col];
    }

    /**
     * @return integer
     */
    public int getColumn() {
        // TODO implement here
        return this.column;
    }

    /**
     * @return integer
     */
    public int getRow() {
        // TODO implement here
        return row;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == 'r') {
                    System.out.print("| r ");
                } else if (board[i][j] == 'y') {
                    System.out.print("| y ");
                } else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  1   2   3   4   5   6   7");

    }

}
