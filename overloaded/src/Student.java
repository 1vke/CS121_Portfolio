public class Student {
    private String firstName, lastName;
    private int age;
    private String[] emergencyContacts;
    private String[] currentSubjects;

    // get methods
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getName() {return String.format("%s %s", this.firstName, this.lastName);}
    public int getAge() {return this.age;}
    public String[] getEmergencyContacts() {return this.emergencyContacts;}
    public String[] getCurrentSubjects() {return this.currentSubjects;}

    // set methods
    public void setName(String firstName) {this.firstName = firstName;}
    public void setName(String firstName, String lastName) {this.firstName = firstName; this.lastName = lastName;}
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
