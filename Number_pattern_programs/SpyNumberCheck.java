import java.util.Scanner;

public class SpyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }

        if (sumOfDigits == productOfDigits) {
            System.out.println(number + " is a Spy number.");
        } else {
            System.out.println(number + " is not a Spy number.");
        }

        scanner.close();
    }
}
