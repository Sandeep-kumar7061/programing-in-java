// find duplicate Elements in an array

import java.util.Scanner;
public class DuplicateElements {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println ("Enter the elements of the array:  ");
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        } 

        System.out.println("Duplicate elements in the array are:  ");
        boolean Found  = false;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j< n; j++){
                if (arr[i] == arr[j] ){
                    System.out.println(arr[i] + " ");
                    Found = true;

                }

            }

        }
        if (!Found){
            System.out.println("No duplicate elements found.");

        }
        sc.close();
        System.out.println("End of program. Thank you!");
    }
}