import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long first = 0, second = 1;

            System.out.println("First " + n + " Fibonacci numbers:");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }

        sc.close();
    }
}

