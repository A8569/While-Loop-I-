public class Q15 {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0;

        while (i <= 100) {
            if(i%2==1)
            sum = sum +(1.0/i); 
            i++;      
        }

        System.out.println("Sum of series is  upto 100 is: " + sum);
    }
}