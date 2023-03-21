package javaprograms;
import java.util.Scanner;
public class StudentMarkSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //student name and roll number
        System.out.println("Enter student name: ");
        String name = input.nextLine();

        System.out.println(" Enter roll number: ");
        int rollNo = input.nextInt();

        //Input marks in Math,Science, and English
        System.out.println("Enter marks in Math: ");
        int mathMarks = input.nextInt();

        System.out.println("Enter marks in Science: ");
                int scienceMarks = input.nextInt();

        System.out.println("Enter marks in English:");
        int englishMarks = input.nextInt();

        //check if marks are valid (between 0 and 100)

        if (mathMarks < 0 || mathMarks > 100 || scienceMarks <0 || scienceMarks > 100
                || englishMarks < 0 || englishMarks > 100){
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        // calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (double) totalMarks /3;

        // pass or fail grade

        String result, grade = null;
        if (percentage >= 35) {
            result = "pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            result = "fail";
            grade = "-";

        }
        //Print Mark Sheet
        System.out.println("Student Name:   " + name);
        System.out.println("Roll No:        " + rollNo);
        System.out.println("Marks in Math   " + mathMarks);
        System.out.println("Marks in Science" + scienceMarks);
        System.out.println("Marks in English" + englishMarks);
        System.out.println("Total           " + totalMarks);
        System.out.println("Percentage      " + percentage );
        System.out.println("Result          " + result);
        System.out.println("Grade           " + grade);


        System.out.println("             ______________________________");
        System.out.println("             |           Mark Sheet       |");
        System.out.println("             |____________________________|");
        System.out.println("             |     Name         :   Jay   |");
        System.out.println("             |     Roll No      :   08    |");
        System.out.println("             |____________________________|");
        System.out.println("             |     Subjects     :   Marks |");
        System.out.println("             |____________________________|");
        System.out.println("             |     Math         :   98    |");
        System.out.println("             |     Science      :   90    |");
        System.out.println("             |     English      :   85    |");
        System.out.println("             |____________________________|");
        System.out.println("             |     Total        :   273   |");
        System.out.println("             |____________________________|");
        System.out.println("             |     Percentage   :    91.0 |");
        System.out.println("             |     Result       :    Pass |");
        System.out.println("             |     Grade        :    A+   |");
        System.out.println("             |____________________________|");




    }

        }







