//Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        int n = 0;
        while (true) {
            System.out.print("Enter the number of elements in the array: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                sc.nextLine(); // Consume the newline character left by nextInt()
                if (n > 0) break; // Ensure positive number
            } else {
                System.out.println("Invalid input! Please enter a positive integer.");
                sc.next(); // Consume incorrect input
            }
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            while (true) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    sc.nextLine(); // Consume newline character
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.next(); // Consume incorrect input
                }
            }
        }

        // Initialize min and max with first element
        int max = arr[0];
        int min = arr[0];

        // Finding min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Printing results
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        // Closing the scanner
        sc.close();
    }
}