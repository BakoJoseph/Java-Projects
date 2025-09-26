public class Basic {


    public void calculateSimpleInterest(double principal, double rate){
        double result = (principal * rate) ;
        System.out.println("The simple interest is: " + result);
    }

    public void increment(int number){
        System.out.println(++number);
    }
    public void checkEquality(int firstNumber, int secondNumber){
        if(firstNumber == secondNumber){
            System.out.println("Numbers are the same");
        }
        else {
            System.out.println("Numbers are not equal");
        }
    }

    public void checkAge(int age){
        if(age > 18){
            System.out.println("Age is greater than 18");

        }
        else if (age < 18) {
            System.out.println("Age is less than 18");
        }
        else {
            System.out.println("age is 18");
        }
    }

     public void checkNumber(int number){
        if(number > 10 && number % 2 == 0){
            System.out.println("Chosen number");
        }
     }
     public void negate(int age){
        if(!(age > 18)){
            System.out.println("Age is greater than 18");
        }

     }

    public void arithmeticAssignment(){
        int balance = 10;
        balance -=5;
        System.out.println("balance " + balance);
    }

     public void switching(int option){
        switch (option){
            case 1:
                System.out.println("Buy airtime");
                break;
            case 2 :
                System.out.println("Buy data");
                break;
            case 3 :
                System.out.println("Night plan");
                break;
            default:
                System.out.println("Invalid option");
        }
     }


     public void advancedSwitch(char letter){
         switch (letter){
             case  'a'-> System.out.println("This is a");
             case  'b'-> System.out.println("This is b");
             case  'c'-> System.out.println("This is c");
             case  'd'-> System.out.println("This is d");
             case  65 -> System.out.println("This is upper case A");
             default -> System.out.println("Invalid letter");
         }
     }

    public static void main(String[] args) {
        Basic basic = new Basic();
//        basic.calculateSimpleInterest(5000, 2);
//        basic.increment(7);
//        basic.checkEquality(4,6);
//        basic.checkAge(60);
//        basic.checkNumber(12);
//        basic.negate(5);
 //       basic.arithmeticAssignment();
      //  basic.switching(1);
        basic.advancedSwitch('A');
    }
}
