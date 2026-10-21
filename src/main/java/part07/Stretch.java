package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.




public class Stretch {

    public static void main(String[] args) {

        // Stretch A: Practice logical operators
        int age = 20;
        boolean hasID = true;

        // Check if the person is old enough and has ID
        if (age >= 18 && hasID) {
            System.out.println("You can enter.");
        } else {
            System.out.println("You cannot enter.");
        }

        // Check if either condition is true
        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday) {
            System.out.println("You have a day off.");
        }

        // Check if something is NOT true
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("It is not raining.");
        }

        // Stretch B: Practice while loops
        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

    }
}
