import java.util.Scanner;
public class Multiplication {
    Scanner scanner = new Scanner(System.in);
    public void Times(){
        int Num1 = scanner.nextInt();
        for (int I = 1; I <= 10; I++) {
                System.out.println(Num1 + " X " + I + " = " + (I * Num1));
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your number to generate a multiplication table: ");
        Multiplication Mul = new Multiplication();
        Mul.Times();
    }
}