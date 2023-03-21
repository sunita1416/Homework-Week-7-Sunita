package javaprograms;
//6. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;
public class FindOutOddOrEvenNumber {
    public static void main(String[] args) {
        //we create a new instance of the 'Scanner' class and use it ot prompt the user for input
        // We store the user's input in an integer variable 'number'
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        //Check if the number is even or odd using the modulo operator
        if (number % 2 == 0) {
            //Print the result
            System.out.println(number + "is even");
        } else {
            System.out.println(number + "is odd");
        }

    }
}
