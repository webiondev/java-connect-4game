/*
 * This program represents the abstract player functionality
 */
package bathassgn2req3;

import java.util.*;

/**
 * the abstract class
 */
public abstract class Player {

    private int type;//player type 1. human 2. is computer
    private char playerColor;
    private int count;//count of match
    protected int moves = 0; //check max moves

    /**
     * chooses a column to place move
     *
     * @return integer
     */
    public abstract int chooseColumn();

    /**
     * places the choice in column
     *
     * @param move 
     * @param type
     * @param board
     * @return board
     */
    public abstract Board placeCounter(int move, char type, Board board);

    /**
     * set player type
     *
     * @param type
     */
    public void setType(int type) {

        this.type = type;
    }

    /**
     * get player type
     *
     * @return integer
     */
    public int getType() {
        // TODO implement here
        return this.type;
    }

    /**
     * set player color
     *
     * @param color
     */
    public void setPlayerColor(char color) {

        this.playerColor = color;
    }

    /**
     * get player color
     *
     * @return char
     */
    public char getColor() {
        // TODO implement here
        return this.playerColor;
    }

    /**
     * set count
     *
     * @param count
     */
    public void setCount(int count) {
        // TODO implement here
        this.count = count;

    }

    /**
     * get count
     *
     * @return count
     */
    public int getCount() {

        return this.count;
    }

}
