package src;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerMove = randomNumber.nextInt(101);

        System.out.print("Guess a number from 1 to 100: ");

        String playerInput = scanner.nextLine();

        while (true) {

            boolean wrongInput = false;

            for (int i = 0; i < playerInput.length(); i++) {
                if (!Character.isDigit(playerInput.charAt(i))) {
                    System.out.print("Wrong input! Please try again: ");
                    wrongInput = true;
                    break;
                }
            }

            if (wrongInput) {
                playerInput = scanner.nextLine();
                continue;
            }

            int playerNumber = Integer.parseInt(playerInput);


            if (computerMove > playerNumber) {
                System.out.print("Too low! Please try again: ");
                playerInput = scanner.nextLine();
                continue;
            } else if (computerMove < playerNumber) {
                System.out.print("Too high! Please try again: ");
                playerInput = scanner.nextLine();
                continue;
            } else {
                System.out.println("You guessed it!");
                System.out.println();
                System.out.println("Do you want to play again?");
                System.out.print("[Y]es or [N]o: ");
            }

            boolean endGame = false;

            while (true) {

                String newGame = scanner.nextLine();

                if (newGame.equals("Y") || newGame.equals("Yes") || newGame.equals("y")){
                    computerMove = randomNumber.nextInt(101);
                    System.out.print("Guess a number from 1 to 100: ");
                    playerInput = scanner.nextLine();
                    break;
                } else if (newGame.equals("N") || newGame.equals("No") || newGame.equals("n")) {
                    System.out.println("Good bye!");
                    endGame = true;
                    break;
                } else {
                    System.out.println("Wrong input! Please try again.");
                    System.out.print("[Y]es or [N]o: ");
                }
            }
            if (endGame) {
                break;
            }
        }
    }
}
