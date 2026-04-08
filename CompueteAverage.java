// Enhanced version of ComputeAverage.java with error handling and better structure

import java.util.Scanner;

public class ComputeAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                total += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        if (count > 0) {
            double average = total / count;
            System.out.printf("The average of the entered numbers is: %.2f\n", average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}