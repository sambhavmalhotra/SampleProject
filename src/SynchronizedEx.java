/**
 * Created by malhotrs on 7/7/2017.
 */

class ExamplePart {
    String x;

    synchronized void runExamplePart(String x) {
        this.x = x;
        for(int i=0; i<x.length(); i++)
            System.out.print(x.charAt(i));
        System.out.println("");
    }
}

class Exmple implements Runnable{
    String str;
    ExamplePart ex;
    public Exmple(String str, ExamplePart ex) {
        this.str = str;
        this.ex = ex;
    }
    public void run() {
        String[] msg = str.split(" ");
        for (String m : msg) {
            ex.runExamplePart(m);
            try {
                //Thread.sleep(100);
                Thread.yield();
            } catch (Exception e) {
            }
        }
    }
}

public class SynchronizedEx {
    public static void main(String[ ] args) {
        ExamplePart e = new ExamplePart();
        Exmple e1 = new Exmple("First one is running", e);
        Exmple e2 = new Exmple("Second thread has begun", e);
        Exmple e3 = new Exmple("Third link will start", e);
        Exmple e4 = new Exmple("Fourth continues", e);
        Exmple e5 = new Exmple("Fifth it is", e);
        Exmple e6 = new Exmple("Last one initiated", e);
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);
        Thread t4 = new Thread(e4);
        Thread t5 = new Thread(e5);
        Thread t6 = new Thread(e6);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        System.out.println("Exiting main thread...");
    }
}
