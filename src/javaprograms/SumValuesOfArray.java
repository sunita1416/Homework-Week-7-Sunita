package javaprograms;
//17. Write a Java program to sort a numeric array and a string array.
public class SumValuesOfArray {
    public static void main(String[] args) {
        int[] numbers = {3,7,2,9,1};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println("The sum of the array is: " + sum);
    }
}
