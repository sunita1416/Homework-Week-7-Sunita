package javaprograms;
//17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
public class NumericAndStringArray {
    public static void main(String[] args) {
        // sorting a numeric array
        int[] numbers = {3,6,2,9,12,15};
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));

        //sorting a string array

        String[] names = {"Shanu", "Sally", "Julie", "Mamta", "John"};
        Arrays.sort(names);
        System.out.println("Sorted string array: " + Arrays.toString(names));

    }
}
