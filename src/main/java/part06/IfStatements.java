

public class IfStatements {

    // This starts the program.
    public static void main(String[] args) {

        // This creates a variable for age.
        int age = 18;

        // This checks if the person is 18 or older.
        if (age >= 18) {
            // This prints if the person is an adult.
            System.out.println("You are an adult.");
        } else {
            // This prints if the person is under 18.
            System.out.println("You are a minor.");
        }

        // This creates a variable for temperature.
        int temp = 75;

        // This checks if it is hot outside.
        if (temp >= 80) {
            // This prints if it is hot.
            System.out.println("It is hot outside.");
        } else if (temp >= 60) {
            // This prints if the weather is warm.
            System.out.println("It is warm outside.");
        } else {
            // This prints if the weather is cold.
            System.out.println("It is cold outside.");
        }

        // This creates a variable for a student's grade.
        int grade = 85;

        // This checks if the grade is an A.
        if (grade >= 90) {
            // This prints A.
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            // This prints B.
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            // This prints C.
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            // This prints D.
            System.out.println("Grade: D");
        } else {
            // This prints F.
            System.out.println("Grade: F");
        }
    }
}