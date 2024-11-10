import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// Tìm từ dài nhất
public class Bai1 
{     
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
     Scanner sc = new Scanner(System.in);
        int save_len = 0;
        String save_word = "";
        while(sc.hasNextLine())
        {
            String[] words = sc.nextLine().trim().split("\\s+");
            for(String i: words)
            {
                if(save_len<i.length())
                {
                    save_len = i.length();
                    save_word = i;
                }
            }
        }
        System.out.printf("%s - %d", save_word, save_len);
    }
    
}