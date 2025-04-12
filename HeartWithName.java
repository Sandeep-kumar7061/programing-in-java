import java.util.Scanner;

public class HeartWithName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a name
        System.out.println("Enter the name to display in the heart:");
        String name = sc.nextLine();

        System.out.println("\nHere is your heart with the name inside:\n");

        // ASCII art heart with the name embedded
        System.out.println("      ******       ******");
        System.out.println("    **********   **********");
        System.out.println("  ************* *************");
        System.out.println(" *****************************");
        System.out.println(" *****************************");
        System.out.printf("  ****   %-10s   ****\n", name); // Embed the name into the heart
        System.out.println("   *************************");
        System.out.println("    ***********************");
        System.out.println("     *********************");
        System.out.println("      *******************");
        System.out.println("       *****************");
        System.out.println("         *************");
        System.out.println("           *********");
        System.out.println("             *****");
        System.out.println("               *");

        sc.close();
    }
}