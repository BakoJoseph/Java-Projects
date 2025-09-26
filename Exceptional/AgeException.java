package Exceptional;
//this is a custom exception class for age-related errors .
public class AgeException extends Exception{
    //Constructor to pass an error message when the exception is thrown
    public AgeException(String message){
        super(message);//Calls the exception class constructor
    }
}
