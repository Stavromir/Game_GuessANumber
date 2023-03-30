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
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }

            playerMove = Integer.parseInt(scanner.nextLine());

        }

            System.out.println("You guessed it");






    }
}
