/*
 * This program represents the computer player functionality
 */
package bathassgn2req3;

import java.util.*;

/**
 * the computer player class
 */
public class ComputerPlayer extends Player {

    /**
     * Default constructor
     */
    Random random;

    public ComputerPlayer() {

        random = new Random();
    }

    /**
     * Allow computer move
     *
     * @return random integer for computer move
     */
    public int chooseColumn() {

        return random.nextInt(7) + 1;
    }

    /**
     * place counter for computer player
     *
     * @param move 
     * @param player
     * @param board
     * @return board object
     */
    public Board placeCounter(int move, char player, Board board) {

        boolean placed = false;

        if (player == 'r') {
            for (int i = board.getRow() - 1; i >= 0; i--) {

                for (int j = 0; j < board.getColumn(); j++) {
                    if (!placed) {
                        if (board.getBoard(i, move - 1) == 'y' || board.getBoard(i, move - 1) == 'b') {

                            continue;

                        } else if (board.getBoard(i, move - 1) != 'r') {
                            //System.out.print("i: "+i+" j: "+j);
                            placed = true;
                            board.setBoard(i, move - 1, 'r');
                            this.moves++;
                        }
                    }

                }

            }

        }//player r
        else if (player == 'y') {
            for (int i = board.getRow() - 1; i >= 0; i--) {
                for (int j = 0; j < board.getColumn(); j++) {
                    if (!placed) {
                        if (board.getBoard(i, move - 1) == 'r' || board.getBoard(i, move - 1) == 'b') {

                            continue;

                        } else if (board.getBoard(i, move - 1) != 'y') {
                            //System.out.print("i: "+i+" j: "+j);
                            placed = true;
                            board.setBoard(i, move - 1, 'y');
                            this.moves++;
                        }
                    }

                }

            }

        } else if (player == 'b') {

            for (int i = board.getRow() - 1; i >= 0; i--) {
                for (int j = 0; j < board.getColumn(); j++) {
                    if (!placed) {
                        if (board.getBoard(i, move - 1) == 'r' || board.getBoard(i, move - 1) == 'y') {

                            continue;

                        } else if (board.getBoard(i, move - 1) != 'b') {
                            //System.out.print("i: "+i+" j: "+j);
                            placed = true;
                            board.setBoard(i, move - 1, 'b');
                            this.moves++;
                        }
                    }

                }

            }
        } else if (this.moves == 42) {
            System.out.println("Board full! No winners!");
        }
        return board;
    }

}
