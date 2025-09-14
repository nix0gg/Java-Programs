import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // Initialize an array to store the marks of 50 students
        int[] marks = new int[50];
        Scanner sc = new Scanner(System.in);
        
        // Accept marks for 50 students
        for (int i = 0; i < 50; i++) {
            while (true) {
                System.out.print("Enter the marks for student " + (i + 1) + ": ");
                try {
                    int mark = sc.nextInt();
                    // Check if the mark is within the valid range of 0-100
                    if (mark >= 0 && mark <= 100) {
                        marks[i] = mark;
                        break;
                    } else {
                        System.out.println("Please enter a valid mark between 0 and 100.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    sc.next(); // clear the invalid input
                }
            }
        }

        // Count the number of students who scored above 90
        int countAbove90 = 0;
        for (int mark : marks) {
            if (mark > 90) {
                countAbove90++;
            }
        }

        // Output the result
        System.out.println("The number of students who scored above 90: " + countAbove90);
    }
}
//Note: When using the scanner function, it is considered safer to close the scanner object with the syntax "sc.close();".
//However, since we're working with a small program, we don't have to worry about resource leaks.