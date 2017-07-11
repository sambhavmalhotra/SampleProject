/**
 * Created by malhotrs on 7/5/2017.
 */
public class ReverseArray {

    public static int[] ReverseArray(int[] arr) {
        int temp;
        for(int i=0; i<arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int arr[] = {1, 2, 3, 4, 5};
        ReverseArray(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}