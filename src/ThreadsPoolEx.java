/**
 * Created by malhotrs on 7/7/2017.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private int x;
    public WorkerThread(int x){
        this.x = x;
    }
    public void run() {
        int c = x;
        double fac = 1;
        while(c > 0) {
            fac *= c;
            c--;
        }

        System.out.println("Factorial of " + x + " is : " + fac);
    }
}

public class ThreadsPoolEx {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 30; i++) {
            Runnable worker = new WorkerThread(i);
            es.execute(worker);
        }

        es.shutdown();
        System.out.println("shutdown() invoked");
        while (!es.isTerminated());

        System.out.println("Finished all threads");
    }
}
