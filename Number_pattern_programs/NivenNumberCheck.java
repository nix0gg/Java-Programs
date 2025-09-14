import java.util.Scanner;

public class NivenNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int temp = number;

        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (number % sumOfDigits == 0) {
            System.out.println(number + " is a Niven number.");
        } else {
            System.out.println(number + " is not a Niven number.");
        }

        scanner.close();
    }
}
