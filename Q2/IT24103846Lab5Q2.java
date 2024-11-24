import java.util.Scanner;

public class IT24103846Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newMembers;

        // Input validation
        do {
            System.out.print("Enter the number of new members introduced : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
            newMembers = scanner.nextInt();
            if (newMembers < 0) {
                System.out.println("Input must be a numer 0 or greater");
            }
        } while (newMembers < 0);

        // Determine prize using switch statement
        String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
                break;
        }
        System.out.println("Prize is a: " + prize);
    }
}
