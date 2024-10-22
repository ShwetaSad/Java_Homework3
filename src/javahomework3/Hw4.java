package javahomework3;

import java.util.Scanner;

public class Hw4 {
    // A program to find out if a year is leap year or not &
    // another program to check the number of days in a month
    public static boolean isLeapYear(int year){
        if (year <1 || year>9999 ){
            return false;

        }
        else if (year%4==0)
        {
            if (year%100==0){
                if (year%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else {
            return false;
        }
    }


            public static int getDaysInMonth(int month,int year){

                if (month<1 || month>12)
                    return -1;
                if (year<1 || year>9999)
                    return -1;
                switch(month){
                    case 4: case 6: case 9: case 11:
                        return 30;
                    case 2:
                        if (isLeapYear(year)==true){
                            return 29;
                        }
                        else{
                            return 28;
                        }
                    default:
                        return 31;
                }
            }
        }

