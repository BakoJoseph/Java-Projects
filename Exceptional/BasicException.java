package Exceptional;

public class BasicException {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        try {
            result = num1 / num2; //=> Throw an Exception of Type
        }
        catch (Exception arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
        finally {
            System.out.println("Finally joseph");
        }
        System.out.println("Result: " + result);
        System.out.println("After the exception");
    }
}
