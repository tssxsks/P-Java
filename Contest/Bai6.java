import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// Chuẩn hóa họ tên theo 2 cách
public class Bai6
{     
    public static String solve(String type, String s)
    {
        String[] word = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        StringBuilder sb = new StringBuilder();
        if(type.equals("1"))
        {
            String i = word[word.length - 1];
            sb.append(i.substring(0,1).toUpperCase()+i.substring(1,i.length()));
            sb.append(" ");
            for(int k=0; k <= word.length-2; k++)
            {
                String j = word[k];
                sb.append(j.substring(0,1).toUpperCase()+j.substring(1,j.length()));
                sb.append(" ");
            }
        }
        else
        {
            String i = word[0];
            
            for(int k=1; k <= word.length-1; k++)
            {
                String j = word[k];
                sb.append(j.substring(0,1).toUpperCase()+j.substring(1,j.length()));
                sb.append(" ");
            }
            sb.append(i.substring(0,1).toUpperCase()+i.substring(1,i.length()));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t --> 0)
        {
            String type = in.nextLine();
            String s = in.nextLine();
            System.out.println(solve(type, s));
        }
    }
}