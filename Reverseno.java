import java.util.Scanner;

public class ReverseNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        for (int temp = Math.abs(num); temp > 0; temp /= 10) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
        }

        if (num < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}
