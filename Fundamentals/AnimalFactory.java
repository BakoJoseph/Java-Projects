package Fundamentals;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("DOG");
        animal1.speak();

        Animal animal2 = AnimalFactory.getAnimal("CAT");
        animal2.speak();
    }
}
