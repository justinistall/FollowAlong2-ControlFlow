package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminder: if / else if / else — part 06 (video: https://www.youtube.com/watch?v=xk4_1vDrzzo)
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part09/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.






public class Challenge {

    public static int ticketPrice(int age, boolean student) {
        if (age < 5) {
            return 0;
        } else if (age >= 65) {
            return 5;
        } else if (student) {
            return 7;
        } else {
            return 10;
        }
    }

    public static String letterGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        // Test movie ticket prices
        System.out.println("Child ticket: $" + ticketPrice(4, false));
        System.out.println("Student ticket: $" + ticketPrice(19, true));
        System.out.println("Adult ticket: $" + ticketPrice(30, false));
        System.out.println("Senior ticket: $" + ticketPrice(70, false));

        // Test letter grades
        System.out.println("Grade for 95: " + letterGrade(95));
        System.out.println("Grade for 85: " + letterGrade(85));
        System.out.println("Grade for 75: " + letterGrade(75));
        System.out.println("Grade for 65: " + letterGrade(65));
        System.out.println("Grade for 50: " + letterGrade(50));
    }
}
