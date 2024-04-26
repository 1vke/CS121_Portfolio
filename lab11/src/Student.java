import java.util.ArrayList;

public class Student {
    private ArrayList<Course> courses = new ArrayList<>();
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
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public Course getCourse(){
        return null;
    }
    
    public void getAllCourse(){}
    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
}
