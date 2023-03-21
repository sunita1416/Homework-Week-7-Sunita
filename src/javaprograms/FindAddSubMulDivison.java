package javaprograms;
//10.Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else


import java.util.Scanner;

public class FindAddSubMulDivison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input of two numbers
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        //Take input of the mathematical operation symbol

        System.out.println("Enter an operator (+,-,*,/): ");
        char operator = input.next().charAt(0);

        double result;
        //Perform the operation based on the symbol entered
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator entered");
            return;

        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result); //Print the result

    }

    }

