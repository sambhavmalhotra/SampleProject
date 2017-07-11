/**
 * Created by malhotrs on 7/7/2017.
 */

class Ex1 extends Thread{
    String str;
    public Ex1(String str) {
        this.str = str;
    }
    public void run() {
        try {
            for(int i=0; i<str.length(); i++) {
                System.out.print(str.charAt(i));
                Thread.sleep(0);
                }
            } catch(InterruptedException ie) {
            System.out.println(ie + "sleep exception");
        }
    }
}

public class ThreadsEx {
    public static void main(String[ ] args) {
        Ex1 e1 = new Ex1("First one is running");
        Ex1 e2 = new Ex1("Second thread has begun");
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        e1.start();
        e1.setName("First");
        e2.setName("Second");
        e2.start();
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
