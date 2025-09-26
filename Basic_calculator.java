import java.util.Scanner;
public class Basic_calculator {
    Scanner scanner = new Scanner(System.in);
    public void Calculate(){
        System.out.println("Enter an operator: (+), (-), (*), (/) OR press any number to exit");
        switch (acceptChar()){
            case '+' -> {
                System.out.println("Enter your numbers: ");
                int Num1 = acceptInt();
                int Num2 = acceptInt();
                int Result = Num1 + Num2;
                System.out.println("the result is: " + Result);
                Calculate();
                }
            case '-' ->{
                System.out.println("Enter two numbers: ");
                int Num1 = acceptInt();
                int Num2 = acceptInt();
                int Res;
                if (Num2 > Num1) {
                    Res = Num2 - Num1;
                    System.out.println(Num2 + " is larger than " + Num1 +
                            " \nso the result will have a negative value " + "-" + Res);
                    Calculate();
                } else {
                    Res = Num1 - Num2;
                    System.out.println("The result is: " + Res);
                    Calculate();
                }
            } case '*' ->  {
                System.out.println("Enter two numbers: ");
                int Num1 = acceptInt();
                int Num2 = acceptInt();
                int Res = Num1 * Num2;
                System.out.println("The result is: " + Res);
                Calculate();
            } case '/' -> {
                System.out.println("Enter two numbers: ");
                double Num1 = acceptDou();
                double Num2 = acceptDou();
                double Res;
                if (Num2 > Num1) {
                    Res = Num2 / Num1;
                    System.out.println("The will likely be a decimal number: " + Res);
                    Calculate();
                } else {
                    Res = Num1 / Num2;
                    System.out.println("The result is: " + Res);
                    Calculate();
                }
            } default -> System.exit(0);

        }
    }
    public int acceptInt(){
        return scanner.nextInt();
    }
    public double acceptDou(){
        return scanner.nextDouble();
    }
    public char acceptChar(){
        return scanner.next().charAt(0);
    }
    public static void main(String[] args) {
        Basic_calculator calc = new Basic_calculator();
        calc.Calculate();
    }
}