public class Q10 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum = sum +i*(i+1) ; 
            i++;      
        }

        System.out.println("Sum of series is  upto 100 is: " + sum);
    }
}