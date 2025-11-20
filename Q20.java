import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number a: ");
        int a = sc.nextInt();

        System.out.print("Enter exponent b: ");
        int b = sc.nextInt();

        int power = 1;
        int i = 1;

        while (i <= b) {
            power *= a;
            i++;
        }

        System.out.println(a + " to power " + b + " is: " + power);
    }
}