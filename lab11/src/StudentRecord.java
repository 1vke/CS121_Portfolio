import java.util.ArrayList;

public class StudentRecord {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public Student getStudent(String name) {
        Student student = null;
        for (Student e : students) {
            if (e.getName().toLowerCase().equals(name.toLowerCase())) student = e;
        }
        return student;
    }
    public String getAllStudents() {
        StringBuilder output = new StringBuilder();
        
        output.append("Students:\n");
        for (Student e : students) {
            output.append(e.toString());
        }
        
        return output.toString();
    }
}
