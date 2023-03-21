package javaprograms;
//20. Write a Java program to test if an array contains a specific value.
public class ArrayContainsSpecificValue {
    public static void main(String[] args) {
//we create an array of integers to hold the value we want to find
        int[] array = {5,6,7,8,9};
        int valueToFind = 5;
        boolean found = false;

        // Loop to the array to check if the value exists
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                //if we find teh value, we set 'found' variable to 'true'
                found = true;
                break;
            }
        }
        if (found) {
            //we print the message to indicate whether value found or not in the array
            System.out.println("The value " + valueToFind + " is in the array ");
        } else {
            System.out.println("The value " + valueToFind + "is not the array ");
        }
    }
}
