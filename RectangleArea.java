import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Ask for width
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area
        double area = length * width;

        // Display the result
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}