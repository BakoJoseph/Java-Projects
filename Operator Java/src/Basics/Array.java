package Basics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] students = new String[10];
        students[0] = "Bola";
        students[1] = "Bolu";
        System.out.println(students[0]);
        System.out.println(students[1]);


        int[][] numbers = new int[2][2];
        numbers[0][0] = 1;
        numbers[1][2] = 2;
        numbers[3][2] = 3;
        numbers[4][5] = 4;
        System.out.println("Two dimensional array");
        System.out.println(Arrays.deepToString(numbers));

        Double[] height ={7.0,5.9,6.7,5.4};
        System.out.

    }
}
