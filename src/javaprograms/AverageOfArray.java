package javaprograms;
// 19. Write a Java program to calculate the average value of array elements

// 1. a[numbers] = 5,6,10,20,50 = sum is 91
// 2. average is = 91/5

import java.util.Scanner;
public class AverageOfArray {
    public static void main(String[] args) {
        // define an array of integers
        int a[] = {5,6,10,20,50};
        double sum = 0;
        double avg = 0; //calculate the average value of the array

        for (int i =0; i<a.length; i++){
            sum = sum +a[i];

        }
        avg = sum/a.length;

        System.out.println("The Average value of array is: "+avg); // print result


    }
}



