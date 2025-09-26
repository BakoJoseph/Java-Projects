public class Rectangle {
    double a;
    double b;

    public Rectangle(){

    }
    public Rectangle(double length, double breadth){
       a = length;
       b = breadth;
    }
    public double calculateArea(){
       return a * b;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9, 8);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle.calculateArea());



    }
}
