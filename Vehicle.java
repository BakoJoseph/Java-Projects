public class Vehicle {
    String name = "Ferrari";
    int modelNO = 383389337;
    int year = 2025;
    String color = "Black";
    String license_Plate = "BG3758HDA";
    String model = "488 spider";
    String mileage = "1500 miles";
    String registrationDate = "2025-03-01";
    String[] performance = {"Top speed: 211 mph", "Acceleration: 0-60 mph in 2.9 sec", "Fuel Efficiency: 15MPG", "Range: 300 miles"};
    String bodyType;
    String climate_control;

    public static void main(String[] args) {
        System.out.println("This is one of the best car!!!");
        Vehicle Car = new Vehicle();
        Car.bodyType = "Convertible";
        Car.climate_control = "Dual-zone Automatic";
        System.out.println(Car.name);
        System.out.println(Car.modelNO);
        System.out.println(Car.year);
        System.out.println(Car.color);
        System.out.println(Car.license_Plate);
        System.out.println(Car.model);
        System.out.println(Car.mileage);
        System.out.println(Car.registrationDate);
        System.out.println(Car.bodyType);
        System.out.println(Car.climate_control);
        System.out.println("Performance Metrics:");
        System.out.println(Car.performance[0]);
        System.out.println(Car.performance[1]);
        System.out.println(Car.performance[2]);
        System.out.println(Car.performance[3]);
        System.out.println(new Vehicle().color);
    }

}
