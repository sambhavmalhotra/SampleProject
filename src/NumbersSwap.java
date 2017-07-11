/**
 * Created by malhotrs on 7/5/2017.
 */
public class NumbersSwap {
    public static void main(String[] args) {
        int a = 10, b = 30;
        System.out.println("Numbers before swap: ");
        System.out.println("a : " + a + "\tb : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swap: ");
        System.out.println("a : " + a + "\tb : " + b);
    }
}
