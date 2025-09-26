package worker;

public class Praise extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " praise");
        }
    }
}
