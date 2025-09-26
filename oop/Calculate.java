package oop;

public class Calculate {
  final int S = 9;
   static void add(int a, int b){

        System.out.println(a + b);
    }

    static void add(int a, int b, int c){
        System.out.println(a + b);

    }

    static void add(int a, int b, double c){
        System.out.println(a + b);
    }


    public static void main(String[] args) {
       Calculate.add(8, 8);
    }
}
