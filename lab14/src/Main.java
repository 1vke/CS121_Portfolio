public class Main {
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.displayMenu();

        Student student = new Student("Lucas Lowe", "freshmen", 19);

        Course course1 = new Course("GAB 222", "3", "9:30");
        student.addCourse(course1);

        Course course2 = new Course("DAC 224", "3", "9:30");
        student.addCourse(course2);

        Course course3 = new Course("ZXC 101", "3", "9:30");
        student.addCourse(course3);

        Course course4 = new Course("PREP 181", "3", "9:30");
        student.addCourse(course4);

        System.out.println("---unsorted---");
        System.out.println(student.getAllCourses());

        student.sortCourseList();

        System.out.println("---sorted---");
        System.out.println(student.getAllCourses());
    }
}
