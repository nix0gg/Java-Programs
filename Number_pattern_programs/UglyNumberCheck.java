import java.util.Scanner;

public class UglyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isUgly = isUglyNumber(number);
        if (isUgly) {
            System.out.println(number + " is an Ugly number.");
        } else {
            System.out.println(number + " is not an Ugly number.");
        }

        scanner.close();
    }

    private static boolean isUglyNumber(int number) {
        if (number <= 0) return false;
        while (number % 2 == 0) number /= 2;
        while (number % 3 == 0) number /= 3;
        while (number % 5 == 0) number /= 5;
        return number == 1;
    }
}
