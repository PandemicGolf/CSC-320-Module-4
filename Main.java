import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for their values
        System.out.println("Please provide 5 floating point numbers:");

        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int count = 0;

        while (count < 5) {
            System.out.print("Value " + (count + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please try again.");
                scanner.next(); 
            }
        }

        // Calculate average
        double average = total / 5;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Calculate interest at 20%
        double interest = total * 0.20;
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}
