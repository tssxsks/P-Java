package dsicpc;

class Team {
    int id;
    String name, school;

    public Team(int id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public String getId() {
        return String.format("Team%02d", id);
    }

    public String getName() {
        return this.name;
    }

    public String getSchool() {
        return this.school;
    }

}