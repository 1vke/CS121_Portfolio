public class testing {
    public static void main(String[] args) {
        Student newStudent = new Student("Lucas", "Lowe", 18, new String[] {"Mom", "Dad"}, new String[] {"Math", "English", "Science", "History"});

        System.out.println(newStudent.getName());
        
        newStudent.setName("Derek");
        System.out.println(newStudent.getName());
        
        newStudent.setName("Jared", "Berk");
        System.out.println(newStudent.getName());
    }
}
