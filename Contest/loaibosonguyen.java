
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class loaibosonguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> s = new ArrayList<>();
        while(in.hasNext()){
            String n = in.next();
            try {
                int x = Integer.parseInt(n);
            } catch (Exception e) {
                s.add(n);
            }
        }
        Collections.sort(s);
        for (String i : s) {
            System.out.print(i + " ");
        }
    }
}
