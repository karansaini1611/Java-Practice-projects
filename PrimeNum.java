public class PrimeNum {
    public static void main(String[] args) {
        
        int num = 4;
        int count = 0;
        int loop = 2;

        while (loop <= num) {
            if (num % loop == 0) {
                count ++;
            }
            loop++;
        }

        if (count == 1) {
            System.out.println("this number is prime number");
        } else {
            System.out.println("this number is not a prime number");
        }

    }
}
