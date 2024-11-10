import java.math.BigInteger;
import java.util.Scanner;

// Tích chữ số và tổng chữ số
public class Bai4 
{     
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test -- > 0)
        {
            String s = sc.next();
            BigInteger t = BigInteger.ONE;
            int sum =0;
            for(int i=0;i<=s.length()-1;i++)
            {
                if(i%2==0)
                {
                    if(s.charAt(i)!='0')
                    t = t.multiply(BigInteger.valueOf(s.charAt(i) - '0'));
                }
                else
                {
                    sum = sum + (s.charAt(i) - '0');
                }
            }
            System.out.print(t+" "+sum+"\n");
        }
    }
    
    
    
}
