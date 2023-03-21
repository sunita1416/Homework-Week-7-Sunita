package javaprograms;
//12. Write a program that tells us input value is number or an alphabet or symbol

import java.util.*;

public class PrintAsNumberAlphabetOrSymbol {
    public static void main(String[] args) {
        System.out.println("Check if input is Digit/Alphabet/Symbol");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println("Given input is a Alphabet ");
        } else if (ch>='0' && ch<= '9') {
            System.out.println("Given input is Digit ");
        } else {
            System.out.println("Given input is symbol ");

        }
    }
    }


