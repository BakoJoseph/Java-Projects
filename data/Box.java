package data;

public class Box {
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box box  = new Box();
        box.setHeight(6.0);
        System.out.println(box.getHeight());




    }
}
