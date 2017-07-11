/**
 * Created by malhotrs on 7/6/2017.
 */
public class Example {
    static long c = 0;
    public static void main(String[] args) {
       // System.out.println(c++);
        try {
            main(args);
        }
        catch (StackOverflowError e)
        {
            System.out.println("Stopped!");
        }
    }
}
