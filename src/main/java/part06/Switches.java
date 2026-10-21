package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.




// This class is used to practice switch statements.
public class Switches {

    // This is where the program starts.
    public static void main(String[] args) {

        // This stores the day of the week.
        String day = "Monday";

        // This checks which day was selected.
        switch (day) {

            // This runs if the day is Sunday.
            case "Sunday":
                // This prints a message.
                System.out.println("It is Sunday.");
                // This stops the switch.
                break;

            // This runs if the day is Monday.
            case "Monday":
                // This prints a message.
                System.out.println("It is Monday.");
                // This stops the switch.
                break;

            // This runs if the day is Tuesday.
            case "Tuesday":
                // This prints a message.
                System.out.println("It is Tuesday.");
                // This stops the switch.
                break;

            // This runs if the day is Wednesday.
            case "Wednesday":
                // This prints a message.
                System.out.println("It is Wednesday.");
                // This stops the switch.
                break;

            // This runs if the day is Thursday.
            case "Thursday":
                // This prints a message.
                System.out.println("It is Thursday.");
                // This stops the switch.
                break;

            // This runs if the day is Friday.
            case "Friday":
                // This prints a message.
                System.out.println("It is Friday.");
                // This stops the switch.
                break;

            // This runs if the day is Saturday.
            case "Saturday":
                // This prints a message.
                System.out.println("It is Saturday.");
                // This stops the switch.
                break;

            // This runs if none of the days match.
            default:
                // This prints an error message.
                System.out.println("Invalid day.");
        }
    }
}

