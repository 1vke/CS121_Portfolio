package packagesDemo;

public class Student {
    public String firstName, lastName;
    private int age;
    private String[] emergencyContacts;
    private String[] currentSubjects;

    // get methods
    String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    private int getAge() {return this.age;}
    protected String[] getEmergencyContacts() {return this.emergencyContacts;}
    public String[] getCurrentSubjects() {return this.currentSubjects;}

    // set methods
    public void setFirstName(String val) {this.firstName = val;}
    public void setLastName(String val) {this.lastName = val;}
    public void setAge(int val) {this.age = val;}
    public void setEmergencyContacts(String[] val) {this.emergencyContacts = val;}
    public void setCurrentSubjects(String[] val) {this.currentSubjects = val;}

    public Student(String firstName, String lastName, int age, String[] emergencyContacts, String[] currentSubjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.emergencyContacts = emergencyContacts;
        this.currentSubjects = currentSubjects;
    }
}
