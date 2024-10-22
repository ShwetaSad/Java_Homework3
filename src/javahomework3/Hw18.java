package javahomework3;

public class Hw18 {
    //AJava program to sum values of an array.

    public static void main(String[] args) {
        // Define an array with some values
        int[] numArray = {10, 20, 30, 40, 50};

        // Variable to store the sum of the array elements
        int sum = 0;

        // Use a traditional for loop to iterate through the array
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i]; // Add each element to the sum
        }

        // Print the result
        System.out.println("The sum of the array values is: " + sum);
    }
}