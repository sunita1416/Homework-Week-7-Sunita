package javaprograms;
//1. Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)


import java.util.Scanner;
public class OddEvenTernary {    // We use the ternary operator 'condition) ? trueValue : falseValue' to assign
                                 // the value of 'result' based on whether the number is even or odd.
                                // If the remainder of 'number' divided by 2 is 0, then it's even, otherwise it's odd.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result);
    }
}
