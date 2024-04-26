public class UndergradStudent extends Student {
    public UndergradStudent(String firstName, String lastName, int age, String[] emergencyContacts, String[] currentSubjects) {
        super(firstName, lastName, age, emergencyContacts, currentSubjects);
    }
    public boolean isActive() {
        return true;
    }
}
