// Given an array of integrs and a target sum, find a contiguous subarray that sum up to the target

import java.util.HashMap;
import java.util.Map;
 import java.util.Scanner;

   public class SubarraySum {
    public static int[] findSubarray(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum == target) {
                return new int[]{0, i}; // Found subarray from start to current index
            }

            if (sumMap.containsKey(currentSum - target)) {
                return new int[]{sumMap.get(currentSum - target) + 1, i}; // Found subarray
            }

            sumMap.put(currentSum, i);
        }

        return new int[]{}; // No subarray found
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];    
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        scanner.close();

        int[] result = findSubarray(nums, target);
        
        if (result.length > 0) {
            System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
        } else {
            System.out.println("No subarray found");
        }
    }
}