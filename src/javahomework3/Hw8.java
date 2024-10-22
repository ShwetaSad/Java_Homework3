package javahomework3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hw8 {
   // To check if we input any alphabet from “A" to “F” and then print their city name accordingly (using if else) if
   // any other alphabet should be invalid entry
    public static void main(String[] args) {
    //calling Scanner to input alphabet
Scanner sc = new Scanner(System.in);
        System.out.println("please enter an alphabet");
        Character alphabet = sc.nextLine().charAt(0);
        alpha(alphabet);
        sc.close();
    }
    public static void alpha(Character alphabet ){

        if (alphabet == 'A') {
            System.out.println("Antartica");
        } else if (alphabet == 'B') {
            System.out.println("Berlin ");
        } else if (alphabet == 'C') {
            System.out.println("Chicago ");
        }else if (alphabet == 'D') {
            System.out.println("Dominica");
        }else if (alphabet == 'E') {
            System.out.println("Edinburgh");
        }else if (alphabet == 'F') {
            System.out.println("France");
        }else{
            System.out.println("Invalid Entry");
        }

    }
}
