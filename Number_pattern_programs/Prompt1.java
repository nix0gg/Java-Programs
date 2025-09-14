import java.util.Scanner;

public class Prompt1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize sum to 0
        int sum = 0;
        
        // While there are digits left in the number
        while (number != 0) {
            // Add the last digit to the sum
            sum += number % 10;
            // Remove the last digit from the number
            number /= 10;
        }
        
        // Print the sum of the digits
        System.out.println("Sum of digits: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
