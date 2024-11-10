import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tang_dan_giam_dan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            List<Integer> evenNumbers = new ArrayList<>();
            List<Integer> oddNumbers = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int num = in.nextInt();
                if (num % 2 == 0) {
                    evenNumbers.add(num);
                } else {
                    oddNumbers.add(num);
                }
            }
            Collections.sort(evenNumbers);
            Collections.sort(oddNumbers, Collections.reverseOrder());
            for (int even : evenNumbers) {
                System.out.print(even + " ");
            }
            System.out.println();
            for (int odd : oddNumbers) {
                System.out.print(odd + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
