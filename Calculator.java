public class Calculator {

    int firstNumber = 5; // global variable
    int secondNumber = 5;
    double principal = 1000;
    double rate = 5;

    void addition() {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    int additionVersionTwo() {
        int result = firstNumber + secondNumber; //local variable
        return result;
    }

    int minus() {
        return firstNumber - secondNumber;
    }
    public void simpleInterest(){
        double result = (principal * rate) / 100;
        System.out.println("The simple interest is: " + result);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addition();
        System.out.println(calc.minus());
        calc.simpleInterest();


    }
}

