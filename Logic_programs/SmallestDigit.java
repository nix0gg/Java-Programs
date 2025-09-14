import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int smallestDigit = 9;

        while (number != 0) {
            int digit = number % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            number /= 10;
        }

        System.out.println("Smallest digit: " + smallestDigit);
        scanner.close();
    }
}
