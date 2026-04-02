public class CountAndSum {
    public static void main(String[] args) {
        
        int number = 2354;
        int reversNum = 0;
        int remainder;
        int digitCount = 0;
        int digitSum = 0;
        int originalNum = number;

        while (number != 0) {
            
            digitCount++;
            remainder = number % 10;
            reversNum = reversNum * 10 + remainder;
            number /= 10;
            digitSum += remainder;
        }
        System.out.println("Reverse number: " + reversNum);
        System.out.println("Sum of number: " + digitSum);
        System.out.println("Count of number: " + digitCount);
        System.out.println("Original Number: "+ originalNum);
    }
}
