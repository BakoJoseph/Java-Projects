package Fundamentals;

public class Test {
    int[] number = {1, 2, 3};
    String[] myStudent = new String[3];

    String[][] name = {
            {"JULIA","CHISOM"},
            {"JUL","CHI"}
    };
    int[][] scores  = new int[2][2];

    private void inputToArray(){
        myStudent[0] = "Nelson";
        myStudent[1] = "Praise";
        myStudent[2] = "Joseph";
    }
    public void display(){
        for (String name : myStudent){
            System.out.println(name);
        }
    }
    public void displayNumber(){
        for (int num : number){
            System.out.println(num);
        }
    }
    private void inputToTwoDArray(){
        scores[0][0] = 1;
        scores[0][1] = 2;
        scores[1][0] = 3;
        scores[1][1] = 4;

    }
    public void displayTwoDArray(){
        for (int[] oneDimension : scores){
            for (int score : oneDimension){
                System.out.println(score);
            }
        }
    }

    public void displayTwoDArrayMethodTwo(){
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                System.out.println(name[i][j]);
            }
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
       // test.inputToArray();
       // test.display();
       // test.displayNumber();
        //test.inputToTwoDArray();
        //test.displayTwoDArray();
        test.displayTwoDArrayMethodTwo();
    }
}
/** Inheritance in java is a fundamental Object oriented Programming
// concept that allows one class (The subclass) to inherit properties
// and behaviours (Fields and methods) from another class (the superclass).
//POINTS: the sub class get access to the parent class's public and protected members
//the keyword extends is used to inherit from a class
// a subclass can only inherit from only one superclass

//Abstraction in java means it's used to hide the implementation details
// and show only the necessary functionality to the user
//POINTS: abstract is declared with the keyword ABSTRACT.
//Abstract class can have both abstract methods (without implementation)
// and regular methods(with implementation)
//it cannot be instantiated directly.
// (it means it you cannot create an object of an abstract class using the NEW keyword)

//Interface in java is a blueprint of a class that contains only abstract methods(before java 8)
//and default/static methods(from java 8 onwards).
// It is used to achieve full abstraction and multiple inheritance
//it cannot have instance variables only public, static and final constants
//it methods are public and abstract by default (except for private methods in java 9+)
//declared using the interface keyword
//A class can implement multiple interfaces, overcoming the single inheritance limitation

//Encapsulation in java refers to hiding the internal details of a class and only exposing
// the necessary parts through well-defined interfaces(methods)
//POINTS : variables are hidden from direct access by making them private
//public getter and setter (get and set) methods are used to access and modify private data

//polymorphism means it allows different classes to be treated as objects of a common superclass,
// making the code more flexible and scalable
// to make something in multiple form
 **/