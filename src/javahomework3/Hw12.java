package javahomework3;

import java.util.Scanner;

public class Hw12 {
    // program that tells us input value is number or an alphabet or symbol.
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        // Check if input is a digit
        if (Character.isDigit(input)) {
            System.out.println("The input is a number.");
        }
        // Check if input is an alphabet letter
        else if (Character.isLetter(input)) {
            System.out.println("The input is an alphabet.");
        }
        // Otherwise, it must be a symbol
        else {
            System.out.println("The input is a symbol.");
            scanner.close();
        }
    }}
