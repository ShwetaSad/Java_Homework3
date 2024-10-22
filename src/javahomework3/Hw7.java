package javahomework3;

import java.util.Scanner;

public class Hw7 {

    // a java program input sales id, seller's name, sales amount, and salary basic and
    //then fined this sales
    //Commission
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID: ");
        int salesID = scanner.nextInt();
        System.out.println("Enter Seller's Name: ");
        String sellerName = scanner.next();
        System.out.println("Enter Sales Amount: ");
        long salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        String Commision;

        if (salesAmount >= 50000){ ;
        Commision = "35%";
    }else if (salesAmount >= 30000 && salesAmount < 50000){
            Commision = "20%";
            }else if (salesAmount >= 20000 && salesAmount < 30000){
            Commision = "10%";
        }else if (salesAmount >= 10000 && salesAmount < 20000) {
            Commision = "5%";
        }  else{
            Commision = "2%";
        }

scanner.close();

        }

    }

