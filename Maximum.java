// find maximum element in a array
import java.util.Scanner;
public class Maximum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the aray: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        int max = arr[0];
        for (int i = 1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is:  " + max);
        sc.close();
    }

}