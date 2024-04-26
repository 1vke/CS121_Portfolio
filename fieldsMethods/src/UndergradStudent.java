public class UndergradStudent extends Student {
    public UndergradStudent(String firstName, String lastName, int age, String[] emergencyContacts, String[] currentSubjects) {
        super(firstName, lastName, age, emergencyContacts, currentSubjects);
    }
    public void printDetails() {
        System.out.printf("Undergrad Student:\nName: %s", this.getFirstName() + " " + this.getLastName());
    }
}
