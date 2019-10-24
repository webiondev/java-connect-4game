/*
 * This program represents a ConnectN game
 */
package bathassgn2req3;

/**
 * This class is the main entry point for the game
 */
public class BathAssgn2Req3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // check if command ine argument given
        if (args.length == 1) {
            new Game().startGame(args[0]);
        } else if (args.length == 0) {
            new Game().startGame("");
        } else {
            System.out.println("Enter zero or one value in command line");
        }

    }

}
