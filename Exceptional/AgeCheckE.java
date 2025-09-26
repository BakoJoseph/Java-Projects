package Exceptional;

public class AgeCheckE {
    //Exception to check if the age inputted is too low
    public static void main(String[] args) {
        try {
            checkAge(10);
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Exception: " + illegalArgumentException.getMessage());
        }
    }
    public static void checkAge(int age){
        if (age < 18) throw new IllegalArgumentException(" You must be 18 or older. ");
    }
}
