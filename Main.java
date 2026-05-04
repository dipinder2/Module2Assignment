import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare variables
        double x, y;

        // Ask user for first number
        System.out.print("Enter first number (x): ");
        x = input.nextDouble();

        // Ask user for second number
        System.out.print("Enter second number (y): ");
        y = input.nextDouble();

        // Perform and display arithmetic operations
        System.out.println("\nArithmetic Operations Results:");
        // Addition
        System.out.printf("%.2f + %.2f = %.2f%n", x, y, (x + y));

        // Subtraction
        System.out.printf("%.2f - %.2f = %.2f%n", x, y, (x - y));

        // Multiplication
        System.out.printf("%.2f * %.2f = %.2f%n", x, y, (x * y));

        // Division (with check for division by zero)
        if (y != 0) {
            System.out.printf("%.2f / %.2f = %.2f%n", x, y, (x / y));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Close the scanner
        input.close();
    }
}