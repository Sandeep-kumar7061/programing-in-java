import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        scanner.close();

        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {
        for (int line = 0; line < n; line++) {
            // Print leading spaces for alignment
            for (int space = 0; space < n - line; space++) {
                System.out.print("  "); // Two spaces for better formatting
            }
            
            int C = 1; // First element in the row
            for (int i = 0; i <= line; i++) {
                System.out.print(C + "   "); // Extra spaces between numbers
                C = C * (line - i) / (i + 1); // Compute next element using binomial coefficient
            }
            System.out.println(); // Move to the next row
        }
    }
}
