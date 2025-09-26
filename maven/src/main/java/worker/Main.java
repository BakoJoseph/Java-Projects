package worker;

public class Main {
    public static void main(String[] args) {

        Praise praise = new Praise();
        praise.start();

        Thread josh = new Thread(new Joshua());
        josh.start();
    }
}
