package javahomework3;

import java.util.Scanner;

public class Hw9 {
    //input any alphabet from “A" to “F” and print their city name accordingly (using switch method) if
    //any other alphabet should be invalid entry
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Alphabet");
        char alphabet = sc.next().charAt(0);
        alpha(alphabet);
        sc.close();

    }
    public static void alpha(char alphabet) {

switch (alphabet) {
    case 'A':
        System.out.println("Antartica");
        break;
    case 'B':
        System.out.println("Berlin");
        break;
    case 'C':
        System.out.println("Chicago");
        break;
    case 'D':
        System.out.println("Dalam");
        break;
    case 'E':
        System.out.println("Edinburgh");
        break;
    case 'F':
        System.out.println("France");
        break;
    default:
        System.out.println("Invalid Alphabet");
        break;


}
    }
}
