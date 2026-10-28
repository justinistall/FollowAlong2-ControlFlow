package part09;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps.



import java.util.Random;
import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — PLAN THE GUESSING GAME

        // 1. Pick a random number for the player to guess.
        // 2. Ask the player to enter a guess.
        // 3. Keep guessing until the player gets it right.

        // STEP 2 — FIX THE BUGS

        // Create a random number generator
        Random random = new Random();

        // Print a random number between 1 and 6
        System.out.println("Random works: " + (random.nextInt(6) + 1));

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to type a number
        System.out.print("Type a number: ");

        // Save the number entered
        int guess = scanner.nextInt();

        // Print the number entered
        System.out.println("You typed " + guess);

        // Start the counter at 1
        int count = 1;

        // Repeat the loop three times
        while (count <= 3) {

            // Print the current guess number
            System.out.println("Guess number " + count);

            // Increase the counter to prevent an infinite loop
            count++;
        }

        // Close Scanner
        scanner.close();
    }
}


