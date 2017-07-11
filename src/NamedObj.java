/**
 * Created by malhotrs on 7/10/2017.
 */

class InnerClass1{

    public void met1(){};
	/*{
		System.out.println("met1() in InnerClass1");
	}*/
}

public class NamedObj {
    static void met2(InnerClass1 ic) {
        ic.met1();
    }
    public static void main(String args[])
    {
        InnerClass1 obj = new InnerClass1(){
            public void met1(){
                System.out.println("met1() in Anonymous class");
            }
        };
        obj.met1();
        InnerClass1 obj2 = new InnerClass1();
        obj.met1();
        obj2.met1();

        met2(new InnerClass1() {
            public void met1() {
                System.out.println("Class as parameter");
            }
        });
    }
}