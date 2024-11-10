package dsicpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTeam = Integer.parseInt(sc.nextLine());
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < nTeam; i++) 
            teams.add(new Team(i+1, sc.nextLine(), sc.nextLine()));
        ArrayList<Student> students = new ArrayList<>();
        int nStudent = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nStudent; i++) {
            students.add(new Student(i + 1, sc.nextLine()));
            String team = sc.nextLine();
            for (Team t : teams) {
                if (t.getId().equals(team))
                    students.get(i).setTeam(t);
            };
        }
        Collections.sort(students);
        students.forEach(System.out::println);
        sc.close();
    }
}