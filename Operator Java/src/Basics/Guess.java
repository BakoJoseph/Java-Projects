package Basics;

import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    boolean isLoop = true;

    int acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your guess number :");
        int input = scanner.nextInt();
        return input;
    }

    int generateRandomNumber(int start, int end) {
        Random random = new Random();
        int randomNumber = random.nextInt(start, end + 1);
        return randomNumber;
    }

    void checking() {
        int generatedNumber = generateRandomNumber(1, 50);
        while (isLoop) {
            int userInput = acceptInput();
            if (generatedNumber == userInput) {
                System.out.println("congrat!!! you've successsfully guessed the number");
                isLoop = false;
            } else {
                if (userInput > generatedNumber) {
                    System.out.println("Oop!!! the number is too high");
                } else {
                    System.out.println("Oops!!! the number is too low");
                }
            }
        }
    }
        public static void main (String[]args){
            Guess guess = new Guess();
            guess.checking();

        }
    }



