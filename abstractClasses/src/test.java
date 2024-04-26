public class test {
    public static void main(String[] args) {
        Student newStudent = new UndergradStudent("Lucas", "Lowe", 18, new String[] {"Mom", "Dad"}, new String[] {"Math", "English", "Science", "History"});
        Student gradStudent = new GradStudent("Jamie", "Biggalow", 24, new String[] {"Mom", "Dad"}, new String[] {});

        System.out.println(newStudent.isActive());
        System.out.println(gradStudent.isActive());
    }
}
