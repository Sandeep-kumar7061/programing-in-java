// Write java program to reverse a string taken as input from the user

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string to reverse: ");
            String input = scanner.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed string: " + reversed);
        }

    }
    

    
}