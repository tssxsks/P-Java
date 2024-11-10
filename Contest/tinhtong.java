
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DATA.in"));
        long res = 0;
        while(in.hasNext()){
            String n = in.next();
            try {
                int x = Integer.parseInt(n);
                res += x;
            } catch(Exception e){

            }
        }
        System.out.println(res);
    }
}
