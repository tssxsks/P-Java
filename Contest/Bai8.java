import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// Sắp xếp theo số lần xuất hiện
public class Bai8
{     
    public static boolean check(String s)
    {
        char c = s.charAt(0);
        for(int i=1;i<=s.length()-1;i++)
        {
            if(c>s.charAt(i))return false;
            c = s.charAt(i);
        }
        return true;
    }
    public static class freq implements Comparable <freq>
    {
        private String x;
        private int f_x;
        public freq(String x, int f_x)
        {
            this.x = x;
            this.f_x = f_x;
        }
        @Override
        public int compareTo(freq o) 
        {
            int ans = Integer.compare(o.f_x, this.f_x);
            if(ans == 0)
                return 0;
            return ans;
        }
        @Override
        public String toString()
        {
           String ans = "";
           for(int i=1;i<=this.f_x;i++)
           {
               ans = ans + String.valueOf(this.x)+" ";
           }
           return ans;
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0)
        {
            Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
            int n = in.nextInt();
            for(int i = 1;i<=n;i++)
            {
                int x = in.nextInt();
                mp.put(String.valueOf(x), mp.getOrDefault(String.valueOf(x), 0) +1);
            }
            ArrayList<freq> arl = new ArrayList<>();
            for(String key: mp.keySet())
            {
                arl.add(new freq(key, mp.get(key)));
            }
            Collections.sort(arl);
            for(freq i: arl)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}