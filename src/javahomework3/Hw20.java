package javahomework3;

import java.util.Scanner;

public class Hw20 {
    // A Java program to test if an array contains a specific value.

    public static void main(String[] args) {
        // Define an array with some values
        int[] numArray = {10, 20, 30, 40, 50};

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a value to search
        System.out.print("Enter a number to check if it exists in the array: ");
        int valueToFind = scanner.nextInt();

        // Variable to track if the value is found
        boolean found = false;

        // Loop through the array to check for the value
        for (int num : numArray) {
            if (num == valueToFind) {
                found = true;
                break; // Exit loop if value is found
            }
        }

        // Output the result
        if (found) {
            System.out.println(valueToFind + " is present in the array.");
        } else {
            System.out.println(valueToFind + " is not present in the array.");
        }

        // Close the scanner
        scanner.close();
    }

}
