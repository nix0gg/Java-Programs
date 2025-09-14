import java.util.Scanner;

public class CompositeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isComposite = false;

        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }

        if (isComposite) {
            System.out.println(number + " is a composite number.");
        } else {
            System.out.println(number + " is not a composite number.");
        }

        scanner.close();
    }
}
