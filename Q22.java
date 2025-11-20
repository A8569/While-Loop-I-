import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 6) {
            System.out.println("Number must be >= 6");
            return;
        }

        int sum = 1; 
        int i = 2;

        while (i * i <= n) {
            if (n % i == 0) {
                int fact1 = i;
                int fact2 = n / i;

                if (fact1 != fact2) {
                    sum += fact1 + fact2;
                } else {
                    sum += fact1; 
                }
            }
            i++;
        }

        System.out.println("Sum of  " + n + " is: " + sum);
    }
}