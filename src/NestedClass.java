/**
 * Created by malhotrs on 7/5/2017.
 */

class A {
    int a;
    A(int x) {
        a = x;
    }
    public int getA() {
        return a;
    }

    class B {
        int b;
        B(int x) {
            b = x;
        }
        public int getB() {
            return b;
        }
        public int getSum() {
            return a+b;
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        A a1 = new A(10);
        A.B b1 = a1.new B(20);
        System.out.println("a : " + a1.getA());
        System.out.println("b : " + b1.getB());
        System.out.println("sum : " + b1.getSum());
    }
}
