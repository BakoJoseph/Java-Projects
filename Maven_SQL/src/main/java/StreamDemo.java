import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamDemo {
    void streamFromList() {
        //Created the List
        List<String> studentNames =
                Arrays.asList("Subhash", "Anita", "Rohit", "Tarun", "Prakash", "Purvi");
//Created the Stream using Collection
        Stream<String> listStream = studentNames.stream();
//forEach method is printing the stream values
        listStream.forEach(System.out::println);

    }

    void intermediateOperation() {
        List<String> list = List.of("1", "2", "3", "4", "5", "6", "9");
        list.stream().skip(3).forEach(System.out::print); //prints: 45
        System.out.println();
        list.stream().limit(3).forEach(System.out::print); //prints: 123
        System.out.println();
        list.stream().filter(s -> Objects.equals(s, "2")).forEach(System.out::print); //prints: 2
        System.out.println();
        list.stream().dropWhile(s -> Integer.valueOf(s) < 3).forEach(System.out::print); //prints: 345
        System.out.println();
        list.stream().takeWhile(s -> Integer.valueOf(s) < 3).forEach(System.out::print); //prints: 1
    }

    void terminalOperation(){
        List<Integer> integerValues= Arrays.asList(10,20,30,40,50,60,70);
        integerValues.stream().map(value -> value*5).forEach(System.out::println);
        System.out.println("=====================");
        Integer intr=integerValues.stream().map(value->value*5).reduce((n1,n2) -> n1+n2).get();
        System.out.println(intr.intValue());
    }

    void sorting() {
        List<String> list = List.of("2", "1", "5", "4", "3");
        list.stream().sorted().forEach(System.out::print);
        System.out.println();//prints: 12345
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }

    public static void main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        //streamDemo.streamFromList();
        streamDemo.intermediateOperation();
        //streamDemo.sorting();
        //streamDemo.terminalOperation();
    }
}
