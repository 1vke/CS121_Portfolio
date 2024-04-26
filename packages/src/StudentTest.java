import packagesDemo.Student;

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
        // Default -- System.out.printf("Student:\n    name: %s %s\n", student.getFirstName(), student.getLastName());

        // Private -- System.out.printf("    age: %d\n", student.getAge());

        // vvv this works because it is inside the same package,
        // vvv it also works if it is a subclass in a different package.
        System.out.print("    emergency contacts: ");
        // Protected -- for(String ec : student.getEmergencyContacts()) System.out.printf("%s%s", ec, (student.getEmergencyContacts()[student.getEmergencyContacts().length - 1] == ec) ? " " : ", ");

        System.out.print("\n    current subjects: ");
        for(String cs : student.getCurrentSubjects()) System.out.printf("%s%s", cs, (student.getCurrentSubjects()[student.getCurrentSubjects().length - 1] == cs) ? "\n" : ", ");
    }
}
