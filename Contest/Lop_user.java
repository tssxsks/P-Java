import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username, password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return username.equals(user.username) && password.equals(user.password);
    }
    @Override
    public int hashCode() {
        return username.hashCode() * 31 + password.hashCode();
    }
}
public class Lop_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<User> usersList = new ArrayList<>();
        Map<String, Integer> loginCountMap = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String username = sc.next();
            String password = sc.next();
            usersList.add(new User(username, password));
            loginCountMap.put(username, 0);
        }
        int t2 = sc.nextInt();
        ArrayList<User> loginAttempts = new ArrayList<>();
        for (int i = 0; i < t2; i++) {
            String username = sc.next();
            String password = sc.next();
            loginAttempts.add(new User(username, password));
        }
        for (User attempt : loginAttempts) {
            String username = attempt.getUsername();
            String password = attempt.getPassword();
            if (loginCountMap.containsKey(username) && usersList.contains(new User(username, password))) {
                loginCountMap.put(username, loginCountMap.get(username) + 1);
            }
        }
        for (User user : usersList) {
            String username = user.getUsername();
            System.out.print(loginCountMap.get(username) + " ");
        }
    }
}