import java.util.Scanner;

public class AutomorphicCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int square = number * number;
        boolean isAutomorphic = String.valueOf(square).endsWith(String.valueOf(number));

        if (isAutomorphic) {
            System.out.println(number + " is an Automorphic number.");
        } else {
            System.out.println(number + " is not an Automorphic number.");
        }

        scanner.close();
    }
}
