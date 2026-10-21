package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




// This class is used to practice for loops.
public class ForLoops {

    // This is where the program starts.
    public static void main(String[] args) {

        // This loop counts from 1 to 10.
        for (int i = 1; i <= 10; i++) {

            // This prints the current number.
            System.out.println(i);
        }

        // This prints a space between the loops.
        System.out.println();

        // This loop counts backward from 10 to 1.
        for (int i = 10; i >= 1; i--) {

            // This prints the current number.
            System.out.println(i);
        }

        // This prints a message before the last loop.
        System.out.println("Counting by 2:");

        // This loop counts by 2 from 0 to 10.
        for (int i = 0; i <= 10; i += 2) {

            // This prints each number.
            System.out.println(i);
        }
    }
}
