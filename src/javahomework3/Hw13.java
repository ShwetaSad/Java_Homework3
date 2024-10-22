package javahomework3;

import java.util.Scanner;

import static javahomework3.Hw11.m1;

public class Hw13 {
    //a Java program which input any number between 1 to 7 and it print The Days
    //name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();

        m1(day);
        scanner.close();
    }
        public static void m1(int day){
            // Use switch to print corresponding day of the week
            switch (day) {
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("TUESDAY");
                    break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");
                    break;
                default:
                    System.out.println("Week contains 1 to 7 days");
                    break;
            }


        }

    }
