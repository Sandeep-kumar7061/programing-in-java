public class Diamondpattern {
    public static void main(String args[]) {
        int n = 5;
        
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Printing spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Printing stars
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Printing spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Printing stars
            }
            System.out.println();
        }
    }
}

