import java.io.FileWriter;
import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("Input your name");
        Scanner scanner  = new Scanner(System.in);
        String name  = scanner.nextLine();
        System.out.println(name);
        System.out.println("Input your age");
        int age  = scanner.nextInt();
        System.out.println(age);
    }
}
