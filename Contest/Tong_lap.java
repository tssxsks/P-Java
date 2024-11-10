import java.math.BigInteger;
import java.util.Scanner;

public class Tong_lap {
    public static BigInteger solve(BigInteger a){
        if(a.toString().length()==1){
            return a;
        }
        String b = a.toString();
        int m = b.length() / 2;
        BigInteger l = new BigInteger(b.substring(0,m));
        BigInteger r = new BigInteger(b.substring(m));
        System.out.println(l.add(r));
        BigInteger sum = l.add(r);
        return solve(sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ln = in.nextLine();
        in.close();
        BigInteger a = new BigInteger(ln);
        solve(a);
    }
}
