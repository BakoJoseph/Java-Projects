package Exceptional;

public class CustomAgeCheck {
    public static void checkAge(int Age) throws AgeException{
        // If age is less than 18, throw our custom exception
        if (Age < 18 ) throw new AgeException("You must be 18 or older. ");
        System.out.println("Access granted. ");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);//Testing with an age less than 18
        } catch (AgeException exception){
            System.out.println("Custom Exception: " + exception.getMessage());
        }
    }
}
