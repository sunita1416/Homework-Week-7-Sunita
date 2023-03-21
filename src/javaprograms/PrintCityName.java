package javaprograms;
//8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Scanner;
public class PrintCityName {
    public static void main(String[] args) {
        char alphabet;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        alphabet = input.next().charAt(0);

        if (alphabet == 'A') {
            System.out.println("City name: Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City name: Bihar");
        } else if (alphabet == 'C') {
            System.out.println("City name: Chandigadh");
        } else if (alphabet == 'D') {
            System.out.println("City name: Delhi");
        } else if (alphabet == 'E') {
            System.out.println("City name: Echalkarangi");
        } else if (alphabet == 'F') {
            System.out.println("City name: Faridabad");
        } else {
            System.out.println("Invalid entry.");

        }

    }

    }


