import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Doc_file_nt
{
    static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int sqr = (int) Math.sqrt(n);
        for (int i = 5; i <= sqr; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> List = (ArrayList<Integer>) inp.readObject();
        int[] f = new int[100005];
        for (int i : List)
            if (isPrime(i))
                ++f[i];
        for (int i = 100; i < 1000; ++i)
            if (f[i] > 0)
                System.out.println(i);
    }
}