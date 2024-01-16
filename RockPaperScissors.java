package TheRealGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Calling the game
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        //Input my move
        String myMove = scanner.nextLine();
        //Statements to check possible moves
        if (myMove.equals("r") || myMove.equals("rock")) {
            myMove = ROCK;
        } else if (myMove.equals("p") || myMove.equals("paper")) {
            myMove = PAPER;
        } else if (myMove.equals("s") || myMove.equals("scissors")) {
            myMove = SCISSORS;
            //Statement for no such move
        } else {
            System.out.println("No such move in this game!");
        }
        //Making the computer random moves
        Random randomMove = new Random();
        int computerTurn = randomMove.nextInt(4);
        String computerMoves = "";
        //Statements for the moves of the computer
        if (computerTurn == 0) {
            computerMoves = "Rock";
        } else if (computerTurn == 1) {
            computerMoves = "Paper";
        } else if (computerTurn == 2){
            computerMoves = "Scissors";
        }
        //What the computer chose
        System.out.printf("The computer chose: %s.%n", computerMoves);
        //Statements for the game results
        if ((myMove.equals(ROCK) && computerMoves.equals(SCISSORS)) ||
                (myMove.equals(SCISSORS) && computerMoves.equals(PAPER)) ||
                (myMove.equals(PAPER) && computerMoves.equals(ROCK))) {
            System.out.println("You win!");
        } else if ((myMove.equals(ROCK) && computerMoves.equals(PAPER)) ||
                (myMove.equals(SCISSORS) && computerMoves.equals(ROCK)) ||
                (myMove.equals(PAPER) && computerMoves.equals(SCISSORS))) {
            System.out.println("You lose....");
        } else {
            System.out.println("DRAW!");
        }


    }

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
}
