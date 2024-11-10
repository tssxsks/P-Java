
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tinhtongsolong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DATA.in"));
        long res = 0;
        while(in.hasNext()){
            String n = in.next();
            try {
                int x = Integer.parseInt(n);
            } catch(Exception e1){
                try {
                    long y = Long.parseLong(n);
                    res += y;
                } catch (Exception e2) {
                }
            }
        }
        System.out.println(res);
    }
}
