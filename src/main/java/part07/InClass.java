package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        rewatch 80:43–91:54 for logical operators and while loops
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.



public class InClass {
    public static void main(String[] args) {

        // STEP 1 — Call the canDrive method
        int battery = 50;

        System.out.println(canDrive(battery));

        // While loop
        while (battery > 20) {
            System.out.println("Battery: " + battery);
            battery -= 10;
        }

        // STEP 2 — Fix the bugs

        // Check if battery is between 20 and 100
        boolean inRange = battery > 20 && battery < 100;

        // Check if battery meets either condition
        boolean almostFull = battery > 20 || battery < 100;

        // Check if battery is ready
        boolean ready = battery > 20 && true;

        System.out.println("In range: " + inRange);
        System.out.println("Almost full: " + almostFull);
        System.out.println("Ready: " + ready);
    }

    // STEP 1 — canDrive method
    public static boolean canDrive(int battery) {
        return battery > 20;
    }
}