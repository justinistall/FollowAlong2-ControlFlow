package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        rewatch 68:48–80:18 for if statements and switches
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.



public class InClass {
    public static void main(String[] args) {

        // STEP 1 — Call the batteryStatus method.
        batteryStatus(85);
        batteryStatus(45);
        batteryStatus(10);

        // Use a switch to check the mode.
        String mode = "TURN";

        switch (mode) {
            case "TURN":
                System.out.println("Turning");
                break;
            case "STOP":
                System.out.println("Stopped");
                break;
            default:
                System.out.println("Unknown mode");
        }

        // STEP 2 — Fix the bugs.

        // Use equals() to compare strings.
        if (mode.equals("TURN"))
            System.out.println("Turning");
        else
            System.out.println("Stopped");

        // Add parentheses around the condition.
        if (mode.equals("TURN"))
            System.out.println("Turning");
    }

    // STEP 1 — Method to check battery level.
    public static void batteryStatus(int battery) {
        if (battery >= 80) {
            System.out.println("Battery High");
        } else if (battery >= 30) {
            System.out.println("Battery Medium");
        } else {
            System.out.println("Battery Low");
        }
    }
}