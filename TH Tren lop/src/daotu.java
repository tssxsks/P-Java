import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class daotu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            String[] words = s.split("\\s+");

            List<String> wordList = new ArrayList<>();
            Collections.addAll(wordList, words);

            Collections.reverse(wordList);

            System.out.println(String.join(" ", wordList));
        }
        in.close();
    }
}