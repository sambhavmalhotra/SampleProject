package MultipleInheritance;

/**
 * Created by malhotrs on 7/6/2017.
 */
public class A {
    int i;

    public A(int i)
    {
        this.i/* data member*/ = i/*parameter*/;
        System.out.println("A(int i)");
    }

    public void show()
    {
        System.out.println("Value of A.i is:"+i);
    }
}
