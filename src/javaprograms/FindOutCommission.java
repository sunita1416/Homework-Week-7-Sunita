package javaprograms;
//7. Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
// Sales amount >= 50,000 35%
// Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner;
public class FindOutCommission {
    public static void main(String[] args) {
        int salesID;
        String sellerName;
        double salesAmount, basicSalary= 0, commission;
        Scanner input = new Scanner(System.in);

        //Input sales ID, Seller's name, sales amount
        System.out.println("Enter sales ID: ");
        salesID = input.nextInt();

        System.out.println("Enter seller's name: ");
        sellerName = input.next();

        System.out.println("Enter sales amount: ");
        salesAmount = input.nextDouble();

        //calculate commission based on sales amount

        if (salesAmount >=50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.5;
        } else {
            commission = salesAmount * 0.02;

        }
        //Calculate total salary (basic salary + commission)

        double totalSalary = basicSalary + commission;

        //Print out the result

        System.out.println("SalesID: + salesID");
        System.out.println("Seller's Name: + sellerName");
        System.out.println("Sales amount:" + salesAmount);
        System.out.println("Commission: " + commission);
        System.out.println("Total salary: " + totalSalary);


    }

    }


