public class GradStudent extends Student{
    public GradStudent(String firstName, String lastName, int age, String[] emergencyContacts, String[] currentSubjects) {
        super(firstName, lastName, age, emergencyContacts, currentSubjects);
    }
    
    public void printDetails() {
        System.out.printf("Grad Student:\nName: %s", this.getFirstName() + " " + this.getLastName());
    }
}
