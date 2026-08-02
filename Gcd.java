import java.util.Scanner;

public class GCDWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int num1 = Math.abs(a);
        int num2 = Math.abs(b);

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " is: " + num1);
        sc.close();
    }
}
