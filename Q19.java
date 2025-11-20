import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println(n + "! = " + fact);
    }
}