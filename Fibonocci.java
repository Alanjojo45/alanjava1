import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit for Fibonacci series: ");
        int limit = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + limit + ":");
        while (first <= limit) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        sc.close();
    }
}
