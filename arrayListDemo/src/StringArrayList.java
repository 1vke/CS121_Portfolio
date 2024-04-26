import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> stringList = new ArrayList();

    public void addString(String value) {
        stringList.add(value);
    }
    public void removeString(String value) {
        stringList.remove(value);
    }
    public int getSize() {
        return stringList.size();
    }
    public String getElementByIndex(int index) {
        return stringList.get(index);
    }
    
    public void forEachPrint() {
        System.out.println("Printing values with for each:");
        for(String value : stringList) {
            System.out.printf("%s\n", value);
        }
    }
    
    public void regForPrint() {
        System.out.println("Printing values with regular for:");
        for(int i = 0; i < stringList.size(); i++) {
            System.out.printf("%s\n", stringList.get(i));
        }
    }
}
