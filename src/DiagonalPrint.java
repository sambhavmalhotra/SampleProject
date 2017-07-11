/**
 * Created by malhotrs on 7/5/2017.
 */
public class DiagonalPrint {
    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int i, j;
        int n = arr.length;
        for(i=0; i<n; i++) {
            for(j=0;j<arr[0].length;j++) {
                if(i == j)
                    System.out.print(arr[i][j] + " ");
                else if(i+j == n-1)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("- ");
            }
            System.out.println("\n");
        }
    }
}
