public class Q18 {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0;

        while (i <= 100) {
            sum = sum +(1.0/i*(i+1)); 
            i++;      
        }

        System.out.println("Sum of series is  upto 100 is: " + sum);
    }
}