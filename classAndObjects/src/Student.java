public class Student {
    private String studentName, favSubject;
    private int gradeNumber;
    private double gpa;
    public Student(String studentName, int gradeNumber, double gpa, String favSubject) {
        this.studentName = studentName;
        this.gradeNumber = gradeNumber;
        this.gpa = gpa;
        this.favSubject = favSubject;
    }
    public void print() {
        System.out.printf("Student:\n    Name: %s\n    Grade: %d\n    GPA: %.2f\n    Favorite Subject: %s\n", this.studentName, this.gradeNumber, this.gpa, this.favSubject);
    }
}
