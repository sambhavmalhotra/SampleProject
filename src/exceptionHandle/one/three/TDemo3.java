package exceptionHandle.one.three;

import exceptionHandle.one.two.TDemo1;

/**
 * Created by malhotrs on 7/6/2017.
 */

public class TDemo3{

    public TDemo3()
    {
        System.out.println("TDemo2() constructor");
    }

    public void met2() throws Exception,NullPointerException
    {

        TDemo1 td = new TDemo1();
        System.out.println("in met2(), b4 met1()");
        td.met1();
    }
}
