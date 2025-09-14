import java.util.Scanner;

public class Employee {
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);

        int[] ageGroup1 = new int[15]; // 22-30
        int[] ageGroup2 = new int[15]; // 31-40
        int[] ageGroup3 = new int[15]; // 41-50
        int[] ageGroup4 = new int[15]; // 51-60

        int Group1 = 0, Group2 = 0, Group3 = 0, Group4 = 0;

        System.out.println("Enter the ages of 15 employees:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Employee " + (i + 1) + " age: ");
            int age = sc.nextInt();

            if (age >= 22 && age <= 30) {
                ageGroup1[Group1++] = age;
            } else if (age >= 31 && age <= 40) {
                ageGroup2[Group2++] = age;
            } else if (age >= 41 && age <= 50) {
                ageGroup3[Group3++] = age;
            } else if (age >= 51 && age <= 60) {
                ageGroup4[Group4++] = age;
            } else {
                System.out.println("Age " + age + " is not in the specified range.");
            }
        }

        sc.close();

        // Display categorized groups
        System.out.println("\nEmployees in age group 22-30:");
        displayAges(ageGroup1, Group1);

        System.out.println("\nEmployees in age group 31-40:");
        displayAges(ageGroup2, Group2);

        System.out.println("\nEmployees in age group 41-50:");
        displayAges(ageGroup3, Group3);

        System.out.println("\nEmployees in age group 51-60:");
        displayAges(ageGroup4, Group4);
    }

    public static void displayAges(int[] ageGroup, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ageGroup[i] + " ");
        }
        System.out.println();
    }
}
    
