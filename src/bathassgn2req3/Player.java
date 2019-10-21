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
public abstract class Player {

 
    private int type;//player type 1. human 2. is computer
    private char playerColor;
    private int count;//count of match

    /**
     * chooses a column to place move
     * @return integer
     */
    public abstract int chooseColumn();

    /**
     * places the choice in column
     * @return integer
     */
    public abstract Board placeCounter(int move, char type, Board board);

    /**
     * set player type
     * @param integer 
     */
    public void setType(int type) {
       
        this.type=type;
    }

    /**
     * get player type
     * @return integer
     */
    public int getType() {
        // TODO implement here
        return 0;
    }
    
    /**
     * set player color
     * @param integer 
     */
    public void setPlayerColor(char color) {
       
        this.playerColor=color;
    }

    /**
     * get player color
     * @return integer
     */
    public char getColor() {
        // TODO implement here
        return this.playerColor;
    }

    /**
     * set count
     * @param integer
     */
    public void setCount(int count) {
        // TODO implement here
        this.count=count;
        
    }

    /**
     * get count
     * @return integer
     */
    public int getCount() {
       
        return this.count;
    }

}