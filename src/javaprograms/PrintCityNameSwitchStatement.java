package javaprograms;
//09. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Scanner;

public class PrintCityNameSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        String alphabet = scanner.nextLine();

        switch (alphabet.toUpperCase()) {
            case "A":
                System.out.println("Ahmedabad");
                break;

            case "B":
                System.out.println("Bihar");
                break;

            case "C":
                System.out.println("Chandigadh");
                break;

            case "D":
                System.out.println("Delhi");
                break;

            case "E":
                System.out.println("Echarkaranji");
                break;

            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }

    }
}
