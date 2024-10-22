package javahomework3;

import java.util.Scanner;

public class Hw2 {
    //java program to input any year like (ex.2007) and find out if it is leap year or
    //not


    public static void main(String[] args) {
        //scanner object created
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");

        int year = in.nextInt();
     // calling method
        leapyear(year);
     // scanner close
        in.close();

    }

    public static void leapyear(int year) {


        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

