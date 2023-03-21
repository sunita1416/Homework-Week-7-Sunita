package javaprograms;
//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”

import java.util.Scanner;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println(number + " is positive ");
        } else if (number < 0) {
            System.out.println(number + "is negative ");
        }else {
            System.out.println("The number is zero ");
        }
        scanner.close();

        }

    }

