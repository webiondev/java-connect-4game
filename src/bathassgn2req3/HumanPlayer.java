/*
 * This program represents the human player functionality
 */
package bathassgn2req3;

import java.util.*;

/**
 * The human player class
 */
public class HumanPlayer extends Player {

    /**
     * Default constructor
     */
    Scanner playerChoice;

    public HumanPlayer() {

        playerChoice = new Scanner(System.in);

    }

    /**
     * allow player to choose column
     *
     * @return player choice
     */
    public int chooseColumn() {

        int choice = playerChoice.nextInt();;

        while (choice < 1 || choice > 7) {
            System.out.print("between 1 and 7: ");
            choice = playerChoice.nextInt();
        }

        return choice;

    }

    /**
     * place counter for human player
     *
     * @param move made
     * @param player color
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

        }//player y
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
