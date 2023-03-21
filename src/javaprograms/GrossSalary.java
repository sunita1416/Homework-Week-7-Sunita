package javaprograms;
//5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
// HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
// PF= Basic salary 20%
// Gross salary = basic salary + HRA + TA + DA –PF

import java.util.Scanner;
public class GrossSalary {

    public static void main(String[] args) {
        //Enter employee ID, name, basic salary using scanner
        Scanner input = new Scanner(System.in);
        // Input employee details

        System.out.println("Enter employee ID: ");
        int id = input.nextInt();
        //may be type here salary slip format

        System.out.println("Enter employee name: ");
        String name = input.next();
        //type
        System.out.println("Enter basic salary: ");
        double basicSalary = input.nextDouble();
        //type

        //calculate allowances and deductions
        double hra = 0.10 * basicSalary;
        double ta = 0.8 * basicSalary;
        double da = 0.9 * basicSalary;
        double pf = 0.20 * basicSalary;

        //Calculate gross salary
        double grossSalary = basicSalary +hra + ta + da - pf;

        //output employee salary details

        System.out.println("Employee ID: " +id);
        System.out.println("Employee name: "+ name);
        System.out.println("Basic salary: "+ basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("DA: "+ da);
        System.out.println("PF: " + pf);
        System.out.println("Gross salary: " + grossSalary);

        System.out.println("       _________________________________________");
        System.out.println("       |                Salary Slip            |");
        System.out.println("       |                                       |");
        System.out.println("       _________________________________________");
        System.out.println("       | Employee ID                : 2564     |");
        System.out.println("       | Employee Name              : Jay      |");
        System.out.println("       |_______________________________________|");
        System.out.println("       | Basic Salary               : 25000.0  |");
        System.out.println("       | HRA 10%                    : 2500.0   |");
        System.out.println("       | TA 8%                      : 2250.0   |");
        System.out.println("       | DA 9%                      : 2000.0   |");
        System.out.println("       | PF - 20&                   : 5000.0  |");
        System.out.println("       |_______________________________________|");
        System.out.println("       | Gross Salary               : 26750.0  |");
        System.out.println("       |_______________________________________|");
        System.out.println("       |_______________________________________|");
    }

}