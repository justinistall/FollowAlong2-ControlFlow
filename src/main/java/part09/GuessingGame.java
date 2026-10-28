package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.



// Import Scanner to get input from the user
import java.util.Scanner;

// Import Random to generate a random number
import java.util.Random;

public class GuessingGame {

    // Start the program
    public static void main(String[] args) {

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a random number generator
        Random random = new Random();

        // Pick a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        // Store the player's guess
        int guess = 0;

        // Count how many guesses the player makes
        int attempts = 0;

        // Welcome the player
        System.out.println("Welcome to the Number Guessing Game!");

        // Tell the player what to do
        System.out.println("Guess a number between 1 and 100.");

        // Keep playing until the correct number is guessed
        while (guess != secretNumber) {

            // Ask the player for a number
            System.out.print("Enter your guess: ");

            // Save the player's guess
            guess = scanner.nextInt();

            // Add one to the number of attempts
            attempts++;

            // Check if the guess is too high
            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");

                // Check if the guess is too low
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");

                // Tell the player they guessed correctly
            } else {
                System.out.println("Correct! You guessed the number!");

                // Show how many attempts it took
                System.out.println("Attempts: " + attempts);
            }
        }

        // Close the Scanner
        scanner.close();
    }
}
