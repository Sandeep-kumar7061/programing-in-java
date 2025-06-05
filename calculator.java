import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("press 1 for addition \n press 2 for subtraction \n press 3 for multiplication \n press 4 for division \n");
            switch (sc.nextInt()) {
                case 1 -> System.out.println("addition is " + (a + b));
                case 2 -> System.out.println("subtraction is " + (a - b));
                case 3 -> System.out.println("multiplication is " + (a * b));
                case 4 -> System.out.println("division is " + (a / b));
                default -> System.out.println("Invalid input");
            }
        }
    }
    }
