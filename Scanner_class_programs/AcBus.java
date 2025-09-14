import java.util.Scanner;

public class AcBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance travelled:");
        int dist = sc.nextInt();  // Corrected to use 'sc' for input
        int fare = 0;

        if (dist <= 0) {
            fare = 0;
        } else if (dist <= 10) {
            fare = 80;  // Fixed fare for distance <= 10
        } else if (dist <= 20) {
            fare = 80 + (dist - 10) * 6;  // Fare for distance between 11 and 20
        } else if (dist <= 30) {
            fare = 80 + 60 + (dist - 20) * 5;  // Fare for distance between 21 and 30
        } else {
            fare = 80 + 60 + 50 + (dist - 30) * 4;  // Fare for distance above 30
        }

        System.out.println("Fare = " + fare);
    }
}
