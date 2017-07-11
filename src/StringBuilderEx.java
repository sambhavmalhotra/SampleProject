/**
 * Created by malhotrs on 7/7/2017.
 */

class Ex extends Thread{
    String str;
    static StringBuilder sb;
    public Ex(String str, StringBuilder sb) {
        this.str = str;
        this.sb = sb;
    }
    public void run() {
        try {
            for(int i=0; i<str.length(); i++) {
                sb.append("a");
                Thread.sleep(0);
                sb.deleteCharAt(0);
                System.out.println(sb);
            }
        } catch(InterruptedException ie) {
            System.out.println(ie + "sleep exception");
        }
    }
}

public class StringBuilderEx {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[ ] args) {
        Ex e1 = new Ex("First one is running", sb);
        Ex e2 = new Ex("Second thread has begun", sb);
        Ex e3 = new Ex("Second thread has begun", sb);
        Ex e4 = new Ex("Second thread has begun", sb);
        Ex e5 = new Ex("Second thread has begun", sb);
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        e1.start();
        e2.start();
        e3.start();
        e4.start();
        e5.start();
        e1.setName("First");
        e2.setName("Second");

        System.out.println(e1.getName());
        System.out.println(e2.getName());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}
