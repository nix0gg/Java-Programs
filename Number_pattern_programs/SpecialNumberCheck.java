import java.util.Scanner;

public class SpecialNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
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

        if ((sumOfDigits + productOfDigits) == number) {
            System.out.println(number + " is a special number.");
        } else {
            System.out.println(number + " is not a special number.");
        }

        scanner.close();
    }
}
