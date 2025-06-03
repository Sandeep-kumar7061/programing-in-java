// Left Rotate an array by one possition

import java.util.Scanner;
public class LeftRotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:  ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before left roation:  ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // left rotate the array by one position
        int temp = arr[0];
        for(int i = 0; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        System.out.println("Array after left rotation:  ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}