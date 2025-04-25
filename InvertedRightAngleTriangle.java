public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {  // Corrected loop condition
            for (int j = 1; j <= i; j++) { // j should increment instead of decrement
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
