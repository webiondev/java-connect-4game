/*
 * This program represents the game functionality
 */
package bathassgn2req3;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    //default game
    private int typeConnect = 4;
    private int winCondition = 4;

    private Board board;
    private Player player;

    /**
     * create an instance of board
     */
    private void createBoard() {

        board = new Board();
    }

    /**
     * starts the game
     *
     * @param board
     * @param player objects
     */
    private void playGame(Board b, Player... p) {
        int i = 0;
        for (i = 0; i < p.length;) {
            if (i == 0) {
                p[i].setPlayerColor('r');
            }
            if (i == 1) {
                p[i].setPlayerColor('y');
            }
            if (i == 2) {
                p[i].setPlayerColor('b');

            }
            i++;
        }
        System.out.println(i);
        while (p[0].getCount() != 4 || p[1].getCount() != 4 || p[2].getCount() != 4) {

            int userInput;

            try {

                this.board.printBoard();
                System.out.println("Enter a column number between 1-7 (Player 1): ");
                userInput = p[0].chooseColumn();

                p[0].placeCounter(userInput, 'r', this.board); //player 1

                //check board
                if (this.board.checkHorizontal(p[0].getColor()) || this.board.checkDiagonal(p[0].getColor()) || this.board.checkVertical(p[0].getColor())) {//|| this.board.checkDiagonal() || this.board.checkVertical()
                    p[0].setCount(4);

                }

                //if pl.count ==4 won and exit game
                if (p[0].getCount() == 4) {
                    this.board.printBoard();
                    System.out.println("Player 1 won!");
                    this.endGame();
                }

                this.board.printBoard();
                if (p[1] instanceof HumanPlayer) {
                    System.out.println("Enter a column number between 1-7 (Player 2): ");
                }
                userInput = p[1].chooseColumn();

                p[1].placeCounter(userInput, 'y', this.board); //player 1

                //check board
                if (this.board.checkHorizontal(p[1].getColor()) || this.board.checkDiagonal(p[1].getColor()) || this.board.checkVertical(p[1].getColor())) {//
                    p[1].setCount(4);

                }

                //if pl.count ==4 won and exit game
                if (p[1].getCount() == 4) {
                    this.board.printBoard();
                    System.out.println("Player 2 won!");
                    this.endGame();
                }

                //if Computer player 2
                if (i > 2) {
                    this.board.printBoard();

                    userInput = p[2].chooseColumn();

                    p[2].placeCounter(userInput, 'b', this.board); //player 1

                    //check board
                    if (this.board.checkHorizontal(p[2].getColor()) || this.board.checkDiagonal(p[2].getColor()) || this.board.checkVertical(p[2].getColor())) {//
                        p[2].setCount(4);

                    }

                    //if pl.count ==4 won and exit game
                    if (p[2].getCount() == 4) {
                        this.board.printBoard();
                        System.out.println("Player 3 won!");
                        this.endGame();
                    }

                }//end if

            } catch (InputMismatchException e) {

                System.out.println("Wrong value entered! ");

            }
        }//end moves

    }

    /**
     * Start the game
     *
     * @param argCommandLine arguments
     *
     */
    public void startGame(String argCommandLine) {

        //ask 1. human vs human 2. human vs player
        //Q to quit
        Scanner menuItem;
        String menuChoice = "";

        while (!menuChoice.equals("3")) {
            System.out.println("1. Player vs Player (Requirement 1)\n2. Player vs Computer (Requirement 2)\n3. Player vs 2 Computers (Requirement 5)\n4. Quit\n");
            System.out.print("Enter: ");
            menuItem = new Scanner(System.in);
            menuChoice = menuItem.nextLine();

            //if human vs human
            if (menuChoice.equals("1")) {
                createBoard();

//                player 1 and player 2
                Player pl1 = new HumanPlayer();
                Player pl2 = new HumanPlayer();

                //players move
                playGame(this.board, pl1, pl2);

            } //if human vs player
            else if (menuChoice.equals("2")) {
                createBoard();
                //player 1 and player 2
                Player pl1 = new HumanPlayer();
                Player pl2 = new ComputerPlayer();

                playGame(this.board, pl1, pl2);
            } else if (menuChoice.equals("3")) {
                if (!argCommandLine.equals("")) {
                    createBoard();
                    //player 1 and player 2
                    Player pl1 = new HumanPlayer();
                    Player pl2 = new ComputerPlayer();
                    Player pl3 = new ComputerPlayer();

                    playGame(board, pl1, pl2, pl3);
                } else {
                    System.out.println("Enter from command line a value between 3 and 6");
                }
            } else if (menuChoice.equals("4")) {

                System.out.println("Goodbye!");
                this.endGame();
            } else {
                System.out.println("Choose between 1 - 3");
            }

        }//endwhile

    }

    /**
     * ends the game
     */
    private void endGame() {

        System.exit(0);
    }

    /**
     * sets win condition of the game: default is 4
     *
     * @param winCondition
     */
    private void setWinCondition(int winCondition) {

        this.winCondition = winCondition;
    }

    /**
     * sets the type of game: default is Connect4
     *
     * @param typeConnect
     */
    public void setTypeConnect(int typeConnect) {
        // TODO implement here

        this.typeConnect = typeConnect;
    }

    /**
     * @return integer
     */
    public int getTypeConnect() {
        // TODO implement here
        return this.typeConnect;
    }

    /**
     * @return integer
     */
    public int getWinCondition() {
        // TODO implement here
        return this.winCondition;
    }

}
