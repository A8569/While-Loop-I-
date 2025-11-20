class Q3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 2; 

        while (i <= 100) {
            sum += i;
            i += 3; 
        }

        System.out.println("Sum of even numbers from 1 to 100 is: " + sum);
    }
}