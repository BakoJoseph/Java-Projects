import java.util.Scanner;
public class Iteration {
    String name = "Ahmod";
    public void forLooping(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " Mr Ahmod");
        }
    }
    public void whileLooping(){
        int i  = 0;
        while(i < -1) {
            System.out.println(i + " Mr Ahmod");
            i++;
        }

    }
    public void doWhileLooping(){
        int i  = 0;
        do{
            System.out.println(i + " Mr Ahmod");
            i++;
            System.out.println(i);
        }
        while(i < -1);
    }
    public static void main(String[] args) {
        Iteration iteration = new Iteration();
        //iteration.whileLooping();
        //iteration.doWhileLooping();
        Scanner scanner = new Scanner(System.in);
    }
}


