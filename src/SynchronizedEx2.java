/**
 * Created by malhotrs on 7/7/2017.
 */

class m {}

class PrintEx implements Runnable{
    String str;
    int i;
    m m1;
    PrintEx(String str, m m1) {
        this.str = str;
        this.m1 = m1;
        i = 0;
    }
    public void run() {
        for(; i<str.length(); i++)
        {
            synchronized(m1) {
                for(; String.valueOf(str.charAt(i)) != " " && i<str.length(); i++)
                    System.out.print(str.charAt(i));
            }
            System.out.println("");
            try {
                Thread.yield();
            } catch(Exception e) {

            }
        }
    }
}

public class SynchronizedEx2 {
    public static void main(String[ ] args) {
        m m1 = new m();
        PrintEx e1 = new PrintEx("First one is running", m1);
        PrintEx e2 = new PrintEx("Second thread has begun", m1);
        PrintEx e3 = new PrintEx("Third link will start", m1);
        PrintEx e4 = new PrintEx("Fourth continues", m1);
        PrintEx e5 = new PrintEx("Fifth it is", m1);
        PrintEx e6 = new PrintEx("Last one initiated", m1);
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
