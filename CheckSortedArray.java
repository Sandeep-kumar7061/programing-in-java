// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        
        // Read the full input line
        String input = sc.nextLine();
        
        // Split the input and convert strings to integers
        String[] numbers = input.split(" ");
        int arr[] = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) { 
            arr[i] = Integer.parseInt(numbers[i]); // Converts each string to an integer
        }
        
        // Check if the array is sorted in ascending order
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        
        // Print the result
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
        
        sc.close();
    }
}