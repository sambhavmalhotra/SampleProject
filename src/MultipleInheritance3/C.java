package MultipleInheritance3;

import MultipleInheritance2.B;

/**
 * Created by malhotrs on 7/6/2017.
 */
public class C extends B {
    int k;
    public C(int i,int j,int k)
    {
        super(i,j);
        this.k = k;
        System.out.println("C(int i,int j,int k)");
    }

    public void show()
    {

        System.out.println("Value of C.k is:"+k);
        super.show();
    }
}

