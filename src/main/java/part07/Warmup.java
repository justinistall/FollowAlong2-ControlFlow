package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        (this part's lesson starts here — GUIDE.md has it written out)

// Warm-up — 5 minutes, before the video. Practice. Not graded.
//
// Open part06/Stretch.java. Look at your Stretch B1 (the weather program) for 30 seconds.
// Then close it. Without looking again, type Stretch B1 here, from memory, and run it.
//
// You will need to type the main method yourself. That is the point.



public class Warmup {

    // Start the program
    public static void main(String[] args) {

        // Set the temperature
        int temperature = 75;

        // Check if the weather is hot
        if (temperature >= 85) {
            System.out.println("It is hot outside.");

            // Check if the weather is warm
        } else if (temperature >= 70) {
            System.out.println("It is warm outside.");

            // Check if the weather is cold
        } else if (temperature >= 50) {
            System.out.println("It is cool outside.");

            // Print if the temperature is below 50
        } else {
            System.out.println("It is cold outside.");
        }
    }
}