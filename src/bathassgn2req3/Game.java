package bathassgn2req3;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rahma
 */
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
     */
    public void startGame() {

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

                //player 1 and player 2
                Player pl1 = new HumanPlayer();
                pl1.setPlayerColor('r');
                Player pl2 = new HumanPlayer();
                pl2.setPlayerColor('y');
                //players move
                while (pl1.getCount() != 4 || pl2.getCount() != 4) {

                    int userInput;
                    

                    try {

                        board.printBoard();
                        System.out.println("Enter a column number between 1-7 (Player 1): ");
                        userInput = pl1.chooseColumn();
                       
                          
                        pl1.placeCounter(userInput,'r', board); //player 1
                        
                      
                        //check board
                       if(board.checkHorizontal() || board.checkDiagonal() || board.checkVertical() ){
                           
                          
                           pl1.setCount(4);
                           
                        
                       }
                       
                             //if pl.count ==4 won and exit game
                        if(pl1.getCount()==4){
                            System.out.println("Player 1 won!");
                            this.endGame();
                        }
                       
                      board.printBoard();
                      System.out.println("Enter a column number between 1-7 (Player 2): ");
                        userInput = pl2.chooseColumn();
                       
                          
                        pl2.placeCounter(userInput,'y', board); //player 1
                        
                      
                        //check board
                       if(board.checkHorizontal() || board.checkDiagonal() || board.checkVertical() ){
                           
                          
                           pl2.setCount(4);
                           
                        
                       }
                       
                             //if pl.count ==4 won and exit game
                        if(pl2.getCount()==4){
                            System.out.println("Player 2 won!");
                            this.endGame();
                        }
                        
                    } catch (InputMismatchException e) {

                        System.out.println("Wrong value entered! ");

                        
                    }
                }//end moves

            } //if human vs player
            else if (menuChoice.equals("2")) {
                createBoard();
                //player 1 and player 2
                Player pl1 = new HumanPlayer();
                pl1.setPlayerColor('r');
                Player pl2 = new ComputerPlayer();
                pl2.setPlayerColor('y');
                
                while (pl1.getCount() != 4 || pl2.getCount() != 4) {

                    int userInput;
                    

                    try {

                        board.printBoard();
                        System.out.println("Enter a column number between 1-7 (Player 1): ");
                        userInput = pl1.chooseColumn();
                       
                          
                        pl1.placeCounter(userInput,'r', board); //player 1
                        
                      
                        //check board
                       if(board.checkHorizontal() || board.checkDiagonal() || board.checkVertical() ){
                           
                          
                           pl1.setCount(4);
                           
                        
                       }
                       
                             //if pl.count ==4 won and exit game
                        if(pl1.getCount()==4){
                            System.out.println("Player 1 won!");
                            this.endGame();
                        }
                       
                      board.printBoard();
                      System.out.println("Enter a column number between 1-7 (Player 2): ");
                        userInput = pl2.chooseColumn();
                        
                        
                          
                        pl2.placeCounter(userInput,'y', board); //player 1
                        
                        System.out.println("Computer entered "+userInput);
                        
                        
                        //check board
                       if(board.checkHorizontal() || board.checkDiagonal() || board.checkVertical() ){
                           
                          
                           pl2.setCount(4);
                           
                        
                       }
                       
                             //if pl.count ==4 won and exit game
                        if(pl2.getCount()==4){
                            System.out.println("Player 2 won!");
                            this.endGame();
                        }
                        
                    } catch (InputMismatchException e) {

                        System.out.println("Wrong value entered! ");

                        
                    }
                }//end moves                
            }else if (menuChoice.equals("3")) {

                createBoard();
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
        return 0;
    }

    /**
     * @return integer
     */
    public int getWinCondition() {
        // TODO implement here
        return 0;
    }

}
