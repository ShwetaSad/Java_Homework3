package javahomework3;

public class Hw19 {
        // A Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        // Define an array with some values
        double[] numArray = {10.5, 20.0, 30.5, 40.0, 50.5};

        // Variable to store the sum of the array elements
        double sum = 0;

        // Loop through the array to calculate the sum
        for (double num : numArray) {
            sum += num;
        }

        // Calculate the average
        double average = sum / numArray.length;

        // Print the result
        System.out.printf("The average of the array values is:%.2f%n ", average);
    }

}
