package javaprograms;
//4. Number of Days In Month
//Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//otherwise return false.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
public class IsLeapYear {
    public static boolean iaLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                                          }
                return false;
            }
            return true;
                    }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if (year <= 1 || year > 9999) {
            return -1;
        }
        switch (month){
            case 1:
                return 31;
            case 2:
                if (iaLeapYear(year)) {
                    return 29;
                }
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 30;
            case 9:
                return 30;
            case 10:
                return 31;

                case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        int month = 3;
        int year = 2025;

        int daysInMonth = getDaysInMonth(month, year);
        if (daysInMonth == -1) {
            System.out.println("Invalid month or year");
        } else {
            System.out.println("Number of days in month " + month + "of year " + year);


        }



        }

    }

