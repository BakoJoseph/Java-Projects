package data;
import java.util.Arrays;
import java.util.List;

public class UpperWildcard {
    static class Dog extends Animal{
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }
    static class Cat extends Animal{
        @Override
        void sound() {
            System.out.println("Meow");
        }
    }
    static void printSounds(List<? extends Animal> animals){
        //method that accepts a list of Animal or any subclass of Animal
        for(Animal a : animals){
            a.sound();// Allowed reading
        }
        //animals.add(new Dog()); Not allowed (Writing is restricted)
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        printSounds(dogs);// Works
        printSounds(cats);// Works
    }
}
