package MaTran;
import java.util.Arrays;

public class Matrix {
    public static void sapxep(int n,int m,int k,int[][] a){
        int[] b = new int[n];
        for (int i=0;i<n;i++) {
            b[i] = a[i][k];
        }
        Arrays.sort(b);
        for (int i=0;i<n;i++) {
            a[i][k] = b[i];
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
