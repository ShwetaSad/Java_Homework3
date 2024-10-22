package javahomework3;

import java.util.Scanner;

public class Hw10 {

    //  a java program to input any two number and ask user to enter their symbol (+, -,/,*)

    //  find addition, Subtraction, multiplication and division according to their symbol
    //(using if else)

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Variable to store the result
        double result;

        // Perform the operation based on the operator
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("The result of " + num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("The result of " + num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("The result of " + num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            if (num2 != 0) { // Check for division by zero
                result = num1 / num2;
                System.out.println("The result of " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
        }

        // Close the scanner object
        scanner.close();
    }
}