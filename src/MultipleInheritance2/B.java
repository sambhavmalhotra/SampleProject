package MultipleInheritance2;

import MultipleInheritance.A;

/**
 * Created by malhotrs on 7/6/2017.
 */
public class B extends A {
    int j;
    public B(int p,int j)
    {
        super(p); //shud be first statment in cosntructor
        //this(p);
        this.j = j;
        System.out.println("B(int i,int j)");
    }
    public void show()
    {
        super.show();
        System.out.println("Value of B.j is:"+j);
        //return super;
    }
}
