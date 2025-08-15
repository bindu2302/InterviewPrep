package Recursion;

import java.util.Scanner;

public class Switchcase_example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for course selection
        System.out.print("Enter the course name (Java Programming, Python Programming, Web Development): ");
        String course = scanner.nextLine().trim();

        double courseFee = 0;
        String courseName = "";

        // Use switch-case for course selection
        switch (course.toLowerCase()) {
            case "java programming":
                courseFee = 300.00;
                courseName = "Java Programming";
                break;
            case "python programming":
                courseFee = 250.00;
                courseName = "Python Programming";
                break;
            case "web development":
                courseFee = 500.00;
                courseName = "Web Development";
                break;
            default:
                System.out.println("Invalid course selection. Exiting...");
                scanner.close();
                return;
        }

        // Get user input for user type (Student or Professional)
        System.out.print("Are you a Student or a Professional? (Student/Professional): ");
        String userType = scanner.nextLine().trim();

        double finalFee = courseFee;

        // Use switch-case for user type
        switch (userType.toLowerCase()) {
            case "student":
                finalFee *= 0.85; // Apply 15% discount
                System.out.printf("You selected %s. The final fee with 15%% discount for Students is $%.2f.%n", courseName, finalFee);
                break;
            case "professional":
                System.out.printf("You selected %s. The fee is $%.2f.%n", courseName, courseFee);
                break;
            default:
                System.out.println("Invalid user type. Exiting...");
        }

        scanner.close();
    }
}

