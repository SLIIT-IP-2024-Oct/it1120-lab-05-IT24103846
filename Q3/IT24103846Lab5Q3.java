import java.util.Scanner;

public class IT24103846Lab5Q3 {
    public static void main(String[] args) {
        // Fixed values (constants)
        double roomChargePerDay = 48000.0;
        double discountRate10 = 0.10; // 10% discount
        double discountRate20 = 0.20; // 20% discount

        Scanner input = new Scanner(System.in);

        // Input start and end dates
        System.out.print("Enter the start date(1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter the end date  (1-31): ");
        int endDate = input.nextInt();

        // Validate the dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; 
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return;
        }

        // Calculate number of days
        int numberOfDays = endDate - startDate;

        // Determine discount rate
        double discountRate = 0.0; // Default no discount
        if (numberOfDays >= 5) {
            discountRate = discountRate20;
        } else if (numberOfDays >= 3) {
            discountRate = discountRate10;
        }

        // Calculate costs
        double totalCost = numberOfDays * roomChargePerDay;
        double discountAmount = totalCost * discountRate;
        double finalAmount = totalCost - discountAmount;

        // Output the results
	    System.out.println();
	    System.out.println("room charge per day: " + roomChargePerDay);
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Final amount to pay: Rs. " + finalAmount);

    }
}
