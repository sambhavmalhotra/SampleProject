/**
 * Created by malhotrs on 7/6/2017.
 */
public class OverloadToString {
    int i, j;
    public OverloadToString(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public String toString() {
        String str = "\n i value is : " + i + "\n j value is : " + j;
        return str;
    }
    public static void main(String[] args) {
        OverloadToString x = new OverloadToString(5, 10);
        System.out.println(x.toString());
    }
}

class MyString {

}