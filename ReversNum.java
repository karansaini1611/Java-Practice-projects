public class ReversNum {
    public static void main(String[] args) {       

        int number = 56437;
        int reverseNum = 0;
        int remainder;
        int originalNum = number;
        
        while (number != 0) {
            remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number/= 10;
        }
        System.out.println(reverseNum);
        System.out.println("Original number: " + originalNum);
    }
}
