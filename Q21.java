import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 6) {
            System.out.println("Number must be >= 6");
            return;
        }

        int sum = 0;
        int i = 1;

        while (i <= n / 2) {
            if (n % i == 0)
                sum += i;
            i++;
        }

        System.out.println("Sum is : " + n + " is: " + sum);
    }
}