import java.util.*;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private int ageIndex = 0;
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    // adders and removers

    public void addStudent(String name) {
        studentList.add(name);
    }

    public void removeStudent(String name) {
        studentList.remove(name);
    }

    public void addAge(int age) {
        boolean addedAge = false;
        for (int i = 0; i < ageList.length; i++) {
            if (ageList[i] == 0) {
                ageList[i] = age;
                addedAge = true;
                break;
            }
        }
        if (!addedAge) {
            System.out.println("The array is full! Remove an element first.");
        }
    }
    public void addA(int age){
        if(ageIndex > ageList.length){
            ageList[ageIndex++] = age;
        }
    }
    public void removeA(){
        if(ageIndex > 0){
            ageList[--ageIndex] = 0;
        }
    }

    public void removeAge(int age) {
        boolean removedAge = false;
        for (int i = 0; i < ageList.length; i++) {
            if (ageList[i] == age) {
                ageList[i] = 0;
                removedAge = true;
                break;
            }
        }
        if (!removedAge) {
            System.out.println("Please specify a number that is in the array!");
        }
    }

    public void addMajor(String major, double gpa) {
        majorGpaMap.put(major, gpa);
    }

    public void removeMajor(String major) {
        majorGpaMap.remove(major);
    }

    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }

    public void removeNationality(String nationality) {
        nationalityList.remove(nationality);
    }

    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }

    public void removeHometown(String hometown) {
        hometownStack.remove(hometown);
    }

    public void addHomeState(String homeState) {
        homeStateQueue.add(homeState);
    }

    public void removeHomeState(String homeState) {
        homeStateQueue.remove(homeState);
    }

    public void printStudentList() {
        System.out.println("Student List: ");
        for (String name : studentList) {
            System.out.println("    " + name);
        }
    }

    public void printAgeList() {
        System.out.println("Age List: ");
        for (int e : ageList) {
            System.out.println("    " + e);
        }
    }

    public void printMajorGpaMap() {
        System.out.println("Major GPA Map: ");
        for (Map.Entry<String, Double> e : majorGpaMap.entrySet()) {
            System.out.printf("    %s: %.2f\n", e.getKey(), e.getValue());
        }
    }

    public void printNationalityList() {
        System.out.println("Nationality List: ");
        for (String name : nationalityList) {
            System.out.println("    " + name);
        }
    }

    public void printHometownStack() {
        System.out.println("Hometown Stack: ");
        for (String name : hometownStack) {
            System.out.println("    " + name);
        }
    }

    public void printHomeStateQueue() {
        System.out.println("Home State Queue: ");
        for (String name : homeStateQueue) {
            System.out.println("    " + name);
        }
    }
}
