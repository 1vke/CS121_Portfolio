import java.util.Scanner;

public class Menu {
    static Scanner scnr = new Scanner(System.in);
    private StudentRecord studentRecord = new StudentRecord();

    public void displayMenu() {
        boolean displayingMenu = true;
        System.out.println("********* MENU *********\n");

        while(displayingMenu) {
            System.out.println("1) Create a new student\n2) Remove a student\n3) Display a student's info\n4) Display all student info\n5) Exit");
            System.out.print(">> ");
            String input = scnr.nextLine();

            switch (input) {
                case "1" -> createNewStudent();
                case "2" -> removeStudent();
                case "3" -> displayStudentInfo();
                case "4" -> displayAllStudentInfo();
                case "5" -> displayingMenu = false;
                default -> System.out.println("Please enter a valid option!");
            }
        }
    }
    private void createNewStudent() {
        Student student;
        String name, grade;
        int age;

        System.out.print("Student Info:\nName: ");
        name = scnr.nextLine();
        System.out.print("Grade: ");
        grade = scnr.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(scnr.nextLine());

        student = new Student(name, grade, age);

        System.out.println("Courses: ");
        while (true) {
            String courseName, section, time;
            Course course;

            System.out.print("Name or q to quit: ");
            courseName = scnr.nextLine();
            if (courseName.equals("q")) break;
            System.out.print("Section: ");
            section = scnr.nextLine();
            System.out.print("Time: ");
            time = scnr.nextLine();

            course = new Course(courseName, section, time);
            student.addCourse(course);
            System.out.println("Course added!");
        }

        studentRecord.addStudent(student);

        System.out.printf("Student \"%s\" added to the record!\n", name);
    }
    private void removeStudent() {
        Student student;
        String name;

        System.out.print("Remove student:\nName: ");
        name = scnr.nextLine();

        student = studentRecord.getStudent(name);

        if (student != null) {
            studentRecord.removeStudent(student);
            System.out.printf("Student \"%s\" has been removed from the record.\n", name);
        } else {
            System.out.printf("Student %s does not exist in the record.\n", name);
        }
    }
    private void displayStudentInfo() {
        Student student;
        String name;

        System.out.print("Enter the student's name to display info for: ");
        name = scnr.nextLine();

        student = studentRecord.getStudent(name);

        if (student != null) {
            System.out.print(student.toString());
        } else {
            System.out.printf("Student %s does not exist in the record.\n", name);
        }
    }
    private void displayAllStudentInfo() {
        System.out.println(studentRecord.getAllStudents());
    }
}
