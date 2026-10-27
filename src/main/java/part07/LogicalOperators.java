package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.



// Import Scanner so we can get input from the user
import java.util.Scanner;

public class LogicalOperators {

    // Start the program
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age
        System.out.print("Enter your age: ");

        // Store the age entered
        int age = scanner.nextInt();

        // Ask if the user has an ID
        System.out.print("Do you have an ID? (true/false): ");

        // Store the user's answer
        boolean hasID = scanner.nextBoolean();

        // Use AND to check if both conditions are true
        if (age >= 18 && hasID) {
            // Print if both conditions are true
            System.out.println("You can enter.");
        } else {
            // Print if one or both conditions are false
            System.out.println("You cannot enter.");
        }

        // Use OR to check if at least one condition is true
        if (age < 18 || !hasID) {
            // Print a warning
            System.out.println("You do not meet all requirements.");
        }

        // Use NOT to check if the user has no ID
        if (!hasID) {
            // Print a message
            System.out.println("You need an ID.");
        }

        // Close the Scanner
        scanner.close();
    }
}