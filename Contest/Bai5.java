import java.util.Scanner;
// Đảo ngược dãy chữ
public class Bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            String[] word = s.split("\\s+");
            StringBuilder res = new StringBuilder();
            for(int i = word.length - 1 ; i >= 0 ; i--){
                res.append(word[i]);
                if(i != 0 ){
                    res.append(" ");
                }
            }
            System.out.println(res);
        }
    }
}