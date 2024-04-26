public class Student implements Tuition{
    private String firstName, lastName;
    private int age;
    private String[] emergencyContacts;
    private String[] currentSubjects;

    // get methods
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public int getAge() {return this.age;}
    public String[] getEmergencyContacts() {return this.emergencyContacts;}
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

    public String payOffDebt() {
        return "Woo you payed off debt! Too bad it didn't matter,\nand you will forever be in debt.";
    }

    public String giveAssetsToBSU() {
        return "Ball state has taken your car, your house, and your\nmost personal belongings. They even took your dog. You only\nhave the clothes left on your back.";
    }

    public String cry() {
        return "Crying is no use, you have no money to be able to hydrate yourself";
    }
}
