public class Looping {
    public  static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("number is : "+i);
            if (i==5){
                continue;
            }

        }
        int result = 1>2? 0:1;
        System.out.println("result :"+result);
    }
}
