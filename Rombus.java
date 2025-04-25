import java.util.*;

public class Rombus{
    public static void main(String args[]){
        int n = 5;

        for(int j = 1; j<=n-1; j++){

            // spaces
            for (int m = 1; m <= n - j; m++){
                System.out.print(" "); // Adjusted loop variable
            }
            //stars
            for (int k = 1; k <= 5; k++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}