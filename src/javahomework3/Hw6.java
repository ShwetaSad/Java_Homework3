package javahomework3;

import java.util.Scanner;

public class Hw6 {

        // java program that tells us that Input number is odd or even.

        public static void main(String[] args) {
//Scanner object created
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            // Method call
            printMessage(num);
            // scanner closed
            scanner.close();

        }

        public static void printMessage(int num){
            if (num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }


