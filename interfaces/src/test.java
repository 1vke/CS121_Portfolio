public class test {
    public static void main(String[] args) {
        Student newStudent = new Student("Lucas", "Lowe", 18, new String[] {"Mom", "Dad"}, new String[] {"Math", "English", "Science", "History"});

        System.out.println(newStudent.payOffDebt());
        System.out.println(newStudent.giveAssetsToBSU());
        System.out.println(newStudent.cry());
    }
}
