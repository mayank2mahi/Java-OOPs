// Create an array of integers with a size of 10. Fill the array with random integer values
// between 1 and 100 (inclusive).
// a) Calculate and display the sum of all the elements in the array
// b) Find and display the maximum and minimum values in the array
// c) Calculate and display the average of the array elements
// d) Search for a specific integer value entered by the user. Display whether the value
// is present in the array or not

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ass51a {
    public static void main(String[] args) {
        // Create an array of integers with a size of 10
        int[] array = new int[10];

        // Fill the array with random integer values between 1 and 100 (inclusive)
        fillArrayWithRandomValues(array);

        // a) Calculate and display the sum of all the elements in the array
        int sum = calculateSum(array);
        System.out.println("Sum of array elements: " + sum);

        // b) Find and display the maximum and minimum values in the array
        findMaxAndMin(array);

        // c) Calculate and display the average of the array elements
        double average = calculateAverage(array);
        System.out.println("Average of array elements: " + average);

        // d) Search for a specific integer value entered by the user
        searchForValue(array);
    }

    // Helper method to fill the array with random integer values between 1 and 100 (inclusive)
    private static void fillArrayWithRandomValues(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }

    // Helper method to calculate the sum of all elements in the array
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Helper method to find and display the maximum and minimum values in the array
    private static void findMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    // Helper method to calculate the average of the array elements
    private static double calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    // Helper method to search for a specific integer value entered by the user
    private static void searchForValue(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search in the array: ");
        int searchValue = scanner.nextInt();

        boolean found = false;
        for (int value : array) {
            if (value == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchValue + " is present in the array.");
        } else {
            System.out.println(searchValue + " is not present in the array.");
        }
    }
}
