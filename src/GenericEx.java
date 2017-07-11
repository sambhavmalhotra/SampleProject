/**
 * Created by malhotrs on 7/7/2017.
 */

//Below is an example of Generic class
class Gen<T> {

    private T t[];

    public Gen(T t[]) {
        this.t = t;
    }

    public void show() {
        for(T ob : t)
            System.out.println(ob.toString());
    }
}

public class GenericEx
{
    public static void main(String[] args) {

        Integer a[] = {1, 2, 3, 4, 5};
        Gen<Integer> g = new Gen<>(a);
        g.show();
    }
}