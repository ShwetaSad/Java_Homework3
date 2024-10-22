package javahomework3;

import jdk.jfr.Percentage;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Hw3 {

    /*a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

     */
   static String result;
  static String grade;

    public static void main(String[] args) {



        //Scanner object created
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Student name: ");
        String name = scanner.next();
        System.out.println("please enter roll number: ");
        int rollno = scanner.nextInt();
        System.out.println("please enter English marks: ");
        int english = scanner.nextInt();
        System.out.println("please enter Maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("please enter Science marks: ");
        int science = scanner.nextInt();
        int total = english + maths + science;
        int Percentage = ((maths + english + science) * 100 / 300);
        System.out.println("The percentage is: " + Percentage + "%");

            if (Percentage >= 80 && Percentage <= 100) {
                String result = "Pass";
                String grade = "A+";
                System.out.println("A+");
            } else if (Percentage >= 60 && Percentage <= 80) {
                String result = "Pass";
                String grade = "A";
                System.out.println("A");
            } else if (Percentage >= 50 && Percentage <= 60) {
                String result = "Pass";
                String grade = "B";
                System.out.println("B");
            } else if (Percentage >= 35 && Percentage <= 50) {
                String result = "Pass";
                String grade = "C";
                System.out.println("C");
            } else if (Percentage > 0 && Percentage <= 35) {
                String result = "Fail";
                String grade = "Fail";
                System.out.println("Fail");
            } else {
                String grade = "Invalid input, Marks should be between 0 and 100";
                System.out.println("Invalid input, Marks should be between 0 and 100");


            }
            System.out.println("_____________________________________________ ");
            System.out.println("|                                             |");
            System.out.println("|                Marks Sheet                  |");
            System.out.println("|                                             |");
            System.out.println("|_____________________________________________|");
            System.out.println("|         Name        :      " + name + "           |");
            System.out.println("|         Roll No     :      " + rollno + "              |");
            System.out.println("|_____________________________________________|");
            System.out.println("|        Subjects     :       Marks           |");
            System.out.println("|_____________________________________________|");
            System.out.println("|        Maths        :     " + maths + "                |");
            System.out.println("|        English      :     " + english + "                |");
            System.out.println("|        dScience     :     " + science + "                |");
            System.out.println("|_____________________________________________|");
            System.out.println("|        Total        :     " + total + "               |");
            System.out.println("|_____________________________________________|");
            System.out.println("|        Percentage   :     " + Percentage + "                |");
            System.out.println("|        Result       :     " + result + "              |");
            System.out.println("|        Grade        :     " + grade + "              |");
            System.out.println("|_____________________________________________|");

        }
    }


