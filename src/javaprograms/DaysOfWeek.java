package javaprograms;
//13. Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
// NOTE: if number is out of selection Print message “Week contains 1 to 7 days”

import java.util.Scanner; //create a Scanner object to allow user input.
public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: "); //Prompt user to enter a number between 1 to 7 using print statement
        int num = input.nextInt();                         //We use the 'nextInt()' method of the scanner class
                                                           // to get the user's input and store it in the 'num' variable

        switch (num) {                                    // use Switch statement to define value of Day
            case 1:
                System.out.println("Monday");            // we print value of 'day'by using print statement
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }

    }
}
