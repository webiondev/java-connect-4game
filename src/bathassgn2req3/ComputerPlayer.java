/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bathassgn2req3;

/**
 *
 * @author rahma
 */

import java.util.*;

/**
 * 
 */
public class ComputerPlayer extends Player {

    /**
     * Default constructor
     */
    Random random;

    public ComputerPlayer() {
        
      random= new Random();
    }

    /**
     * returns the column chosen
     * @return integer
     */
    public int chooseColumn(){
        
        return random.nextInt(7);
    }

    /**
     * returns the column placed
     * @return integer
     */
    public Board placeCounter(int move, char player, Board board){
        
        boolean placed = false;

        if (player == 'r') {
            for (int i = board.getRow() - 1; i >= 0; i--) {

                for (int j = 0; j < board.getColumn(); j++) {
                    if (!placed) {
                        if (board.getBoard(i, move - 1) == 'y') {

                            continue;

                        } else if (board.getBoard(i, move - 1) != 'r') {
                            //System.out.print("i: "+i+" j: "+j);
                            placed = true;
                            board.setBoard(i, move - 1, 'r');

                        }
                    }

                }

            }

        }//player r
        else {
            for (int i = board.getRow() - 1; i >= 0; i--) {

                for (int j = 0; j < board.getColumn(); j++) {
                    if (!placed) {
                        if (board.getBoard(i, move - 1) == 'r') {

                            continue;

                        } else if (board.getBoard(i, move - 1) != 'y') {
                            //System.out.print("i: "+i+" j: "+j);
                            placed = true;
                            board.setBoard(i, move - 1, 'y');

                        }
                    }

                }

            }

        }

        return board;
    }

}
