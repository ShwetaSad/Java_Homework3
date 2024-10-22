package javahomework3;

import java.util.Arrays;

public class Hw17 {
    // A Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        // Numeric array
        int[] numArray = {5, 2, 8, 1, 9, 3};

        // String array
        String[] strArray = {"Banana", "Apple", "Grapes", "Mango", "Orange"};

        // Sorting the numeric array
        System.out.println("Numeric array before sorting: " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Numeric array after sorting: " + Arrays.toString(numArray));

        // Sorting the string array
        System.out.println("String array before sorting: " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("String array after sorting: " + Arrays.toString(strArray));
    }

}
