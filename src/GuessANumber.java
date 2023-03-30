package src;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerMove = randomNumber.nextInt(100);

        System.out.print("Guess a number from 1 to 101: ");

        int playerMove = Integer.parseInt(scanner.nextLine());

        while (computerMove != playerMove) {

            if (computerMove > playerMove) {
                System.out.print("Too low! Please try again: ");
            } else {
                System.out.print("Too high! Please try again: ");
            }

            playerMove = Integer.parseInt(scanner.nextLine());

        }

            System.out.println("You guessed it!");

    }
}
