import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Rút gọn dãy
public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            int sum = 0;
            ArrayList<Character> a = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i))) a.add(s.charAt(i));
                else sum += s.charAt(i) - '0';
            }
            Collections.sort(a);
            for (Character c : a) {
                System.out.print(c);

            }
            System.out.println(sum);
        }
    }
}