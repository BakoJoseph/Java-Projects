package Fundamentals;
public class Array {
    int[] numbers = {34, 90, 79, 97, 21, 65, 50, 44, 6};//create an array called numbers
    int largest = numbers[0]; //initialize the first element
    int smallest = numbers[0];

    public void displayNumbers() {
        for (int number : numbers) {
            if (number > largest) largest = number;
            if (number < smallest) smallest = number;
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
    public static void main(String[] args) {
        Array array = new Array();
        array.displayNumbers();
    }
}


