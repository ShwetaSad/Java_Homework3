package javahomework3;

import java.util.Scanner;

public class Hw16 {
    // A Java program that checks if a number entered by the user is "POSITIVE", "NEGATIVE", or "ZERO":

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();  // Taking user input
        //calling method
        num(number);

        scanner.close();  // Close the scanner object
    }

        public static void num ( double number){
            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is POSITIVE");
            } else if (number < 0) {
                System.out.println("The number is NEGATIVE");
            } else {
                System.out.println("The number is ZERO");
            }


        }

    }
