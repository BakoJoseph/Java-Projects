import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Functional {
    void anonymousClassAndLambda(){
        Runnable runnable = new Runnable() {
            @Override public void run() {
                System.out.println("Hello!");
            }
        };
        runnable.run(); //prints: Hello!

        Runnable runnables = () -> System.out.println("Hello!");
        runnables.run();
    }

    void lambdaParam(){
        BiFunction<Double, Integer, Double> f = (x, y) -> x / y;
        System.out.println(f.apply(2.0, 2));
    }

     void printAllCityNames(){
        Consumer<String> printConsumer= t -> System.out.println(t);
        List<String> cities= Arrays.asList("Sydney","Dhaka","New York","London");
        cities.forEach(printConsumer);
    }

    void lambdaLimitation(){
        int x = 7;
        //x = 3; //compilation error
        Function<Integer,Integer> multiply = i -> i * x;
        System.out.println(multiply.apply(3));
    }

    void methodReference(){
        Consumer<String> printConsumer= System.out::println;
        List<String> cities= Arrays.asList("Sydney","Dhaka","New York","London");
        cities.forEach(printConsumer);
    }



    public static void main(String[] args) {
        Functional functional = new Functional();
        //functional.anonymousClassAndLambda();
        //functional.lambdaParam();
        //functional.printAllCityNames();
        //functional.lambdaLimitation();
        functional.methodReference();
    }
}
