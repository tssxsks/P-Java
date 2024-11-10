import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Xoay vòng xâu ký tự
public class Bai7 
{

    public static boolean check(char c) 
    {
        return c >= '0' && c <= '9';
    }

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); 
        String[] a = new String[n];

        for (int i = 0; i < n; i++) 
        {
            a[i] = in.nextLine();
        }
        String s = a[0];
        int m = s.length();
        boolean ok = true;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) 
        {
            int d = 0;
            for (int j = 0; j < n; j++) 
            {
                String x = a[j];
                for (int k = 0; k < m; k++) 
                {
                    if (x.equals(s)) 
                    {
                        d += k;
                        break;
                    }
                    x = x.substring(1) + x.charAt(0); 
                }
                if (!x.equals(s)) 
                {
                    ok = false;
                    break;
                }
            }
            if (!ok) 
            {
                break;
            }
            ans = Math.min(ans, d);
            s = s.substring(1) + s.charAt(0); 
        }

        if (!ok) 
        {
            System.out.println(-1);
        } else 
        {
            System.out.println(ans);
        }
    }

}
