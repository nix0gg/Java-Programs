import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Group1 = new int[10]; // 61-75
        int[] Group2 = new int[10]; // 76-80
        int[] Group3 = new int[10]; // 81-90
        int[] Group4 = new int[10]; // 91-100

        int GroupA = 0, GroupB = 0, GroupC = 0, GroupD = 0;

        System.out.println("Enter the marks of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " marks: ");
            int marks = sc.nextInt();

            if (marks >= 61 && marks <= 75) { // 61-75
                Group1[GroupA++] = marks;
            } else if (marks >= 76 && marks <= 80) { // 76-80
                Group2[GroupB++] = marks;
            } else if (marks >= 81 && marks <= 90) { // 81-90
                Group3[GroupC++] = marks;
            } else if (marks >= 91 && marks <= 100) { // 91-100
                Group4[GroupD++] = marks;
            } else {
                System.out.println("Marks: " + marks + " is not specified (this means that you failed)");
            }
        }
        sc.close();

        // Displaying Output
        System.out.println("\nMarks in group 61-75:");
        displayMarks(Group1, GroupA);
        System.out.println("\nMarks in group 76-80:");
        displayMarks(Group2, GroupB);
        System.out.println("\nMarks in group 81-90:");
        displayMarks(Group3, GroupC);
        System.out.println("\nMarks in group 91-100:");
        displayMarks(Group4, GroupD);
    }

    public static void displayMarks(int[] markGroup, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(markGroup[i] + "");
        }
    }
}
