package MaTran;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException{
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
            Matrix.sapxep(n,m,k,a);
        }
    }
}
