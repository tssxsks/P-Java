package dsicpc;

class Student implements Comparable<Student> {
    int id;
    String name;
    Team team;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return String.format("C%03d", id);
    }

    public String getName() {
        return this.name;
    }


    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override 
    public int compareTo (Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + team.getName() + " " + team.getSchool();
    }

}