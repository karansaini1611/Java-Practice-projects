public class LargerNum {
    public static void main(String[] args) {
        
        int a = 55;
        int b = 54;
        int c = 55;

        if (a >= b && a > c) {
            System.out.println("'A' is bigger");
    
        } else if (b >= a && b > c) {
            System.out.println("'B' is bigger");

        } else if (a == b && a == c) {
            System.out.println("All number are equal");

        } else if (a == c) {
            System.out.println("'A' and 'C' are equal");

        } else if (a == b) {
            System.out.println("'A' and 'B' are equal");

        } else if (b == c) {
            System.out.println("'B' and 'C' are equal");
            
        } else {
            System.out.println("'C' is bigger");
        }
    }
}
