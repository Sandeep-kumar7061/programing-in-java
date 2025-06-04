import java.util.Scanner;
public class month{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the month number (1-12): ");
            int month = sc.nextInt();
            String monthName = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "";
            };

            if (!monthName.isEmpty()) {
                System.out.println("The name of the month is: " + monthName);
            } else {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        }
    }
}