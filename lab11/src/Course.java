public class Course {
    private String name, section, time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return String.format("  %s:\n    Section:%s\n    Time:%s\n", name, section, time);
    }

    public Course(String name, String section, String time) {
        this.name = name;
        this.section = section;
        this.time = time;
    }
}
