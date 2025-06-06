// Take an array of Strings input from the user and find the cumulative (combined) length of all those strings

import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = Integer.parseInt(sc.nextLine()); // Read size as a full line
            String array[] = new String[size];
            int totLength = 0;
            
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextLine(); // Read full line instead of just a word
                totLength += array[i].length();
            }
            
            System.out.println(totLength);
        } // Read size as a full line
    }
}



















