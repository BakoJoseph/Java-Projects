package worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {
    void automaticThread (){
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Runnable(){

            @Override
            public void run() {
                System.out.println("a");
            }
        });
        service.execute(new Run());
        service.shutdown();
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.automaticThread();
    }
}
