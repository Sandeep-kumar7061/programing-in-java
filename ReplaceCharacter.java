// Input a string fom the user. Create a new  string called'result' in which you will replace the letter 'e' in the original string with letter 'i'.
import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Input a string from the user
            System.out.print("Enter a string: ");
            String original = scanner.nextLine();

            // Replace all occurrences of 'e' with 'i'
            String result = original.replace('e', 'i');

            // Display the new string
            System.out.println("Modified string: " + result);

        }
    }
}