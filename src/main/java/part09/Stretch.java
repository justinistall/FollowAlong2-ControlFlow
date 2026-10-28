package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.



// Import Scanner for user input
import java.util.Scanner;

// Import Random for random numbers
import java.util.Random;

public class Stretch {

    // Start the program
    public static void main(String[] args) {

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Create Random
        Random random = new Random();

        // STRETCH A

        // Pick a random number between 1 and 10
        int secretNumber = random.nextInt(10) + 1;

        // Store the user's guess
        int guess = 0;

        // Count the attempts
        int attempts = 0;

        // Tell the user to guess
        System.out.println("Guess a number between 1 and 10.");

        // Keep asking until the answer is correct
        while (guess != secretNumber) {

            // Ask for a guess
            System.out.print("Enter your guess: ");

            // Read the guess
            guess = scanner.nextInt();

            // Add one attempt
            attempts++;

            // Check if the guess is too high
            if (guess > secretNumber) {
                System.out.println("Too high!");

                // Check if the guess is too low
            } else if (guess < secretNumber) {
                System.out.println("Too low!");

                // Print when the guess is correct
            } else {
                System.out.println("Correct!");
            }
        }

        // STRETCH B

        // Show the number of attempts
        System.out.println("You guessed it in " + attempts + " tries.");

        // Ask if the player wants another game
        System.out.print("Do you want to play again? (yes/no): ");

        // Read the answer
        String answer = scanner.next();

        // Check the player's answer
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Run the program again to play!");
        } else {
            System.out.println("Thanks for playing!");
        }

        // Close Scanner
        scanner.close();
    }
}