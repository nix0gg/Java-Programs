import java.util.Scanner;

public class NeonNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int square = number * number;
        int sumOfDigits = 0;

        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        if (sumOfDigits == number) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }

        scanner.close();
    }
}
