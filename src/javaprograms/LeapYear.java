package javaprograms;
//2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not?
public class LeapYear {
    public static void main(String[] args) {
        //year is leap year or not
        int year = 2008;
        // Check if the year is divisible by 4 but not by 100, or divisible by 400

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println(year + "is a leap year ");
        } else {
            System.out.println(year + "is not a leap year");

        }
    }
}
