public class PalindromeNum{
    public static void main(String[] args) {
        
        int number = 131;
        int reversNum = 0;
        int remainder;
        int originalNum = number;

        while (number != 0) {
            remainder = number % 10;
            reversNum = reversNum * 10 + remainder;
            number /= 10;
        }
        System.out.println(reversNum);

        if (originalNum == reversNum) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }
    }
}
