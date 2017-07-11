/**
 * Created by malhotrs on 7/5/2017.
 */
public class DigitsInSequence {
    public static void main(String[] args) {
        int j;
        int x, temp;
        boolean flag;
        for(j=10; j<=1000; j++) {
            flag = true;
            x = j;
            while (x > 9) {
                temp = x % 10;
                x = x / 10;
                if (temp - 1 == x % 10) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                System.out.println(j);
            else
                continue;
        }
    }
}
