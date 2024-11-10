
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<ClassSinhVien> list = new ArrayList<ClassSinhVien>();
        while (sc.hasNextLine()) {
            ClassSinhVien sv = new ClassSinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            list.add(sv);
        }
        list.sort((s1, s2) -> {
            if(s1.getLop().equals(s2.getLop())){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                return s1.getLop().compareTo(s2.getLop());
            }
        });
        for(ClassSinhVien sv : list){
            System.out.println(sv);
        }
    }
}