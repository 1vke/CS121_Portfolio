public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();

        ds.addStudent("Derek");
        ds.addStudent("Lucas");
        ds.addStudent("James");

        ds.addAge(1);
        ds.addAge(2);
        ds.addAge(3);

        ds.addMajor("Computer Science", 2.2);
        ds.addMajor("Finance", 2.3);
        ds.addMajor("Cybersecurity", 2.4);

        ds.addNationality("Haitian");
        ds.addNationality("Swedish");
        ds.addNationality("Finnish");

        ds.addHometown("Newburgh");
        ds.addHometown("Bloomington");
        ds.addHometown("Indy");

        ds.addHomeState("Indiana");
        ds.addHomeState("Illinois");
        ds.addHomeState("Kentucky");

        ds.printStudentList();
        ds.printAgeList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();

        ds.removeStudent("Derek");
        ds.removeAge(3);
        ds.removeMajor("Finance");
        ds.removeNationality("Haitian");
        ds.removeHometown("Indy");
        ds.removeHomeState("Kentucky");

        System.out.println("\nRemoved one item from every data structure. Printing...\n");

        ds.printStudentList();
        ds.printAgeList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();
    }
}