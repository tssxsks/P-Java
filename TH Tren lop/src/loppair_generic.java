import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<T extends Number, U extends Number> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime() {
        return isPrime(first.intValue()) && isPrime(second.intValue());
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}

public class loppair_generic {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            boolean check = false;

            for(int i = 2; i <= n / 2; i++){
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }

            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
