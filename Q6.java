public class Q6 {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;

        while (i <= 100) {
            sum += i * i; 
            i += 2;      
        }

        System.out.println("Sum of squares of even numbers from 1 to 100 is: " + sum);
    }
}