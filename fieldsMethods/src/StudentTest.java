import java.sql.Array;

public class StudentTest {
    public static void main(String[] args) {
        Student newStudent = new Student("Lucas", "Lowe", 18, new String[] {"Mom", "Dad"}, new String[] {"Math", "English", "Science", "History"});
        
        printStudent(newStudent);

        newStudent.setFirstName("Jones");
        newStudent.setLastName("Gilbert");
        newStudent.setAge(23);
        newStudent.setEmergencyContacts(new String[] {"Brother", "Grandma", "Dad"});
        newStudent.setCurrentSubjects(new String[] {"Computer Science", "Gym", "Spanish"});
        
        printStudent(newStudent);
    }
    public static void printStudent(Student student) {
        System.out.printf("Student:\n    name: %s %s\n    age: %d\n", student.getFirstName(), student.getLastName(), student.getAge());

        System.out.print("    emergency contacts: ");
        for(String ec : student.getEmergencyContacts()) System.out.printf("%s%s", ec, (student.getEmergencyContacts()[student.getEmergencyContacts().length - 1] == ec) ? " " : ", ");

        System.out.print("\n    current subjects: ");
        for(String cs : student.getCurrentSubjects()) System.out.printf("%s%s", cs, (student.getCurrentSubjects()[student.getCurrentSubjects().length - 1] == cs) ? "\n" : ", ");
    }
}