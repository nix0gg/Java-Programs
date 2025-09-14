import java.util.Scanner;

public class Salary{
    public static void main(String[] args) {
        
        double[] salaries = new double[20];
        int count = 0;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the salaries of 20 employees:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Salary of employee " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
        }

  
        for (double salary : salaries) {
            if (salary > 50000) {
                count++;
            }
        }

        
        System.out.println("Number of employees earning more than INR 50,000 per month: " + count);

        
        scanner.close();
    }
}
