import java.util.Scanner;

public class DuckNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        boolean isDuck = number.contains("0") && !number.startsWith("0");

        if (isDuck) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        scanner.close();
    }
}
