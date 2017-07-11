/**
 * Created by malhotrs on 7/7/2017.
 */

class Ex2 implements Runnable{
    String str;
    public Ex2(String str) {
        this.str = str;
    }
    public void run() {
        StringBuilder sb = new StringBuilder();
        try {
            for(int i=0; i<str.length(); i++) {
                sb.append(", ");
                sb.append(str.charAt(i));
                //System.out.println(str.charAt(i));
                Thread.sleep(0);
            }
            System.out.println("\n " + sb);
        } catch(InterruptedException ie) {
            System.out.println(ie + "sleep exception");
        }
    }
}

public class StringBuilderEx2 {
    public static void main(String[ ] args) {
        Ex2 e1 = new Ex2("First one is running");
        Thread obj1 = new Thread(e1);
        Thread obj2 = new Thread(e1);
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        obj1.start();
        obj1.setName("First");
        obj2.setName("Second");
        obj2.start();
        System.out.println(obj1.getName());
        System.out.println(obj1.getName());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}
