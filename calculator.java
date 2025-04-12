import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("press 1 for addition \n press 2 for subtraction \n press 3 for multiplication \n press 4 for division \n");
        switch(sc.nextInt()){
            case 1:
                System.out.println("addition is " + (a + b));
                break;
            case 2:
                System.out.println("subtraction is " + (a - b));
                break;
            case 3:
                System.out.println("multiplication is " + (a * b));
                break;
            case 4:
                System.out.println("division is " + (a / b));
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
    }
