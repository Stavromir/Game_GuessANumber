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
            } else if (computerMove < playerNumber) {
                System.out.print("Too high! Please try again: ");
                playerInput = scanner.nextLine();
            } else {
                System.out.println("You guessed it!");
                break;
            }
        }
    }
}
