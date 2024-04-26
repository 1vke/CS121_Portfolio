import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int target, numGuesses = 0;
        String input;
        target = 8;

        System.out.println("Guess a number between 1 and 100, or enter \"q\" if you give up:");
        while (true) {
            input = scnr.nextLine();

            if (input.equals("q")) {
                System.out.printf("Quitter! The number was %d\n", target);
                break;
            } else {
                numGuesses++;
                if (Integer.parseInt(input) == target) {
                    System.out.println("Correct!");
                    break;
                } else {
                    if (Integer.parseInt(input) > target) {
                        System.out.println("Too high. Guess again:");
                    } else {
                        System.out.println("Too low. Guess again:");
                    }
                }
            }
        }
        System.out.printf("Number of guesses: %d", numGuesses);
    }
}
