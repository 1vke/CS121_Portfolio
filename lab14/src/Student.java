import java.util.ArrayList;
import java.util.LinkedList;

public class Student {
    private ArrayList<Course> courses = new ArrayList<>();
    private LinkedList<String> courseList = new LinkedList<>();
    private String name, grade;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Name: " + name + "\n");
        output.append("Grade: " + grade + "\n");
        output.append("Age: " + age + "\n");

        output.append("Courses:\n");
        for (Course e : courses) {
            output.append(e.toString());
        }

        return output.toString();
    }
    public void addCourse(Course course){
        courseList.add(course.getName());
    }
    public void removeCourse(Course course){
        courseList.remove(course.getName());;
    }
    public Course getCourse(){
        return null;
    }

    public String getAllCourses(){
        StringBuilder output = new StringBuilder();
        for (String c : courseList) {
            output.append(c).append("\n");
        }

        return output.toString();
    }

    public void sortCourseList(){
        String temp;
        for (int i = 1; i < courseList.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (courseList.get(i).compareTo(courseList.get(j - 1)) < 0) {
                    temp = courseList.get(i);
                    courseList.set(j, courseList.get(j-1));
                    courseList.set(j-1, temp);
                }
            }
        }
    }

    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
}
