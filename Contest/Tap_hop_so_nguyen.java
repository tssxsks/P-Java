import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Tap_hop_so_nguyen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<Integer> listA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listA.add(in.nextInt());
        }
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            listB.add(in.nextInt());
        }

        Set<Integer> setA = new HashSet<>(listA);
        Set<Integer> setB = new HashSet<>(listB);

        Set<Integer> commonSet = new HashSet<>(setA);
        commonSet.retainAll(setB);
        List<Integer> commonList = new ArrayList<>(commonSet);

        Set<Integer> onlyInASet = new HashSet<>(setA);
        onlyInASet.removeAll(setB);
        List<Integer> onlyInAList = new ArrayList<>(onlyInASet);

        Set<Integer> onlyInBSet = new HashSet<>(setB);
        onlyInBSet.removeAll(setA);
        List<Integer> onlyInBList = new ArrayList<>(onlyInBSet);

        Collections.sort(commonList);
        Collections.sort(onlyInAList);
        Collections.sort(onlyInBList);

        if (commonList.isEmpty()) {
            System.out.println("");
        } else {
            for (int num : commonList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        if (onlyInAList.isEmpty()) {
            System.out.println("");
        } else {
            for (int num : onlyInAList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        if (onlyInBList.isEmpty()) {
            System.out.println("");
        } else {
            for (int num : onlyInBList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
