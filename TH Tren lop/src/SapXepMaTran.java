import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SapXepMaTran {
    public static void matrix(int n,int m,int k,int[][] a){
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
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt()-1;
            int[][] a = new int[n][m];
            for (int i=0;i<n;i++) {
                for (int j =0;j<m;j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            matrix(n,m,k,a);
        }
    }
}
