package exceptionHandle.one;

import exceptionHandle.one.three.TDemo3;

/**
 * Created by malhotrs on 7/6/2017.
 */
public class ThrowsDemo {
    public static void main(String args[]) //throws Exception
    {
        try{
            TDemo3 td2 = new TDemo3();
            System.out.println("in main, b4 met2()");
            td2.met2();
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Exception occurred"+e.getMessage());
            //prints(TO CONSOLE DIRECTLY) line number, class name, file name
            //where the exception has occurred
            //and the methods thru which exception has been propogated, until caught
        }
    }
}
