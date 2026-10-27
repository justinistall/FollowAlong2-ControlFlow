package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.



// Import Scanner to get input from the user
import java.util.Scanner;

public class WhileLoops {

    // Start the program
    public static void main(String[] args) {

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Set the starting number to 1
        int number = 1;

        // Keep looping while the number is 5 or less
        while (number <= 5) {

            // Print the current number
            System.out.println(number);

            // Add 1 to the number
            number++;
        }

        // Ask the user to enter their name
        System.out.print("Enter your name: ");

        // Read the name entered
        String name = scanner.nextLine();

        // Keep asking until the user enters a name
        while (name.isEmpty()) {

            // Tell the user they need to enter a name
            System.out.print("Name cannot be empty. Enter your name: ");

            // Read the new answer
            name = scanner.nextLine();
        }

        // Print a greeting
        System.out.println("Hello, " + name);

        // Set a starting counter
        int count = 1;

        // Run this loop at least once
        do {

            // Print the current count
            System.out.println("Count: " + count);

            // Increase the count by 1
            count++;

            // Repeat while count is 3 or less
        } while (count <= 3);

        // Close the Scanner
        scanner.close();
    }
}