public class Numbers {
    public static void main(int n) {
        // You can change this to take input if needed
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum - i;  // Subtract even numbers
            } else {
                sum = sum + i;  // Add odd numbers
            }
        }

        System.out.println("Sum = " + sum);
    }
}
