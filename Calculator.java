public class Calculator {

    public static void main(String[] args) {
        

        char ch = '-';

        int a = 90;
        int b = 67;

        switch(ch){

            case '+':

                System.out.println("Addition of a and b is = " + (a + b));
                break;

            case '-':

                System.out.println("Substraction of a and b is = " + (a - b));
                break;

            case '*':

                System.out.println("Multiplication of a and b is = " + (a * b));
                break;

            case '/':

                System.out.println("division of a and b is = " + (a / b));
                break;

            default:

            System.out.println("Invalid operation");




        }
    }
    
}
