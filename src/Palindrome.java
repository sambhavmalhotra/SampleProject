/**
 * Created by malhotrs on 7/5/2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        int a = 12321, k = 0, n;
        n = a;
        while(n!=0)
        {
            k *= 10;
            k += (n % 10);
            n /= 10;
        }
        if(k == a)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}
