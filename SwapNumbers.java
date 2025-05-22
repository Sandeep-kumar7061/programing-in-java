import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number:  " );
        int firstNumber = Scanner.nextInt();
        System.out.print("Enter second number:  ");
        int secondNumber = Scanner.nextInt();
        System.out.println("Before swapping: " + firstNumber + " " + secondNumber);

        // swap numbers  without using third variable
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("After swapping:  " + firstNumber + " " + secondNumber);
         Scanner.close();

    }
}