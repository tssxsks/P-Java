import java.util.Scanner;
// Ước số nguyên tố lớn nhất
public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long res = 0;
            long n = in.nextLong();
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    res = Math.max(res, i);
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            if (n != 1) System.out.println(n);
            else System.out.println(res);
        }
    }
}