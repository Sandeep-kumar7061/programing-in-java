

public class PyramidPattern {
    public static void main(String args[]) {
        int n = 5; // Number of rows in the pyramid

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = n - i; j > 0; j--) {  // Corrected condition
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < i * 2 + 1; j++) {  
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
