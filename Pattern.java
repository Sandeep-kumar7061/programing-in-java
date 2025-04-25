import java.util.*;

public class Pattern {
    public static void main(String args[]){
        int n = 5;

        // Upper half
        for(int i=1; i<=n; i++){
            // First part
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }

            // Spaces
            int spaces = 2 * (n - i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // Second part
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i=n; i>=1; i--){
            // First part
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }

            // Spaces
            int lowerSpaces = 2 * (n - i);
            for(int j=1; j<=lowerSpaces; j++){
                System.out.print(" ");
            }

            // Second part
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
