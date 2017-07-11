/**
 * Created by malhotrs on 7/7/2017.
 */

class Example1 implements Runnable{
    String str;
    public Example1(String str) {
        this.str = str;
    }
    public void run() {
        try {
            for(int i=0; i<str.length(); i++) {
                System.out.println(str.charAt(i));
                Thread.sleep(0);
            }
            System.out.println("Exiting child thread...");
        } catch(InterruptedException ie) {
            System.out.println(ie + "sleep exception");
        }
    }
}

public class RunnableThread {
    public static void main(String[ ] args) {
        Example1 e1 = new Example1("First one is running");
        Example1 e2 = new Example1("Second thread has begun");
        Example1 e3 = new Example1("Third link will start");
        Example1 e4 = new Example1("Fourth continues");
        Example1 e5 = new Example1("Fifth it is");
        Example1 e6 = new Example1("Last one initiated");
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);
        Thread t4 = new Thread(e4);
        Thread t5 = new Thread(e5);
        Thread t6 = new Thread(e6);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();
        t1.setName("First");
        t2.setName("Second");
        if(t1.getPriority() < t2.getPriority())
        {
            try {
                t1.join();
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        //t3.start();
        //t4.start();
        //t5.start();
        //t6.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Exiting main thread...");
    }
}
