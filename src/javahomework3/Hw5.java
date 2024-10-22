package javahomework3;

import java.util.Scanner;
// a program to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross Salary.

public class Hw5 {
    public static void main(String[] args) {
//  calling Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");

        String name = scanner.nextLine();
        System.out.print("Enter employee's ID: ");
        int id = scanner.nextInt();


        System.out.print("Enter basic salary: ");

        double basicSalary = scanner.nextDouble();
        double da = 0.08 * basicSalary; // DA is 8% of basic
        double ta = 0.09 * basicSalary; // TA is 9% of basic salary

        double hra = 0.10 * basicSalary; // HRA is 10% of basic

        double pf = 0.20 * basicSalary; // PF is 20% of basic
        double grossSalary = (basicSalary + da + hra + ta + hra) - pf;

        System.out.println("_______________________________________");
        System.out.println("|             Salary Slip              |");
        System.out.println("|______________________________________|");
        System.out.println("|  Employee Id        :      "+id+"        |");
        System.out.println("|  Employee Name      :   "+name+"         |");
        System.out.println("|______________________________________|");
        System.out.println("|  Basic Salary       :   "+basicSalary+"      |");
        System.out.println("|  HRA10%             :   " + hra+"       |");
        System.out.println("|  TA8%               :   " +ta+"       | ");
        System.out.println("|   DA9%              :   " + da+"         |");
        System.out.println("|  PF -20&            :   " + pf+"       | ");
        System.out.println("|________________________________________|");
        System.out.println("|     Gross Salary    :   "+grossSalary+"       |");
        System.out.println("|========================================|");


        scanner.close();



    }

    }
