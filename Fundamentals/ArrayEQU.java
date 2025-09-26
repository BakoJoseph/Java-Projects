package Fundamentals;

public class ArrayEQU {
    int[] Array1 = {1, 2, 3, 4, 5};
    int[] Array2 = {1, 2, 4, 4, 5};
    boolean areEqual = true;

    public void check(){
        if (Array1.length != Array2.length){
            areEqual = false;
        }else {
            for (int i = 0; i < Array1.length; i++) {
                if (Array1[i] != Array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        if (areEqual) {
            System.out.println("The elements in the arrays  are equal.");
        }else {
            System.out.println("The elements in the arrays are not equal.");
        }
    }
    public static void main(String[] args) {
        ArrayEQU arrayEQU = new ArrayEQU();
        arrayEQU.check();
    }
}
