import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericArrayList gal = new GenericArrayList();
        
        ArrayList<Integer> intList = new ArrayList<>(
                Arrays.asList(1,2,3,4,5)
        );
        ArrayList<Double> doubleList = new ArrayList<>(
                Arrays.asList(1.0,2.0,3.0,4.0,5.0)
        );
        ArrayList<String> strList = new ArrayList<>(
                Arrays.asList("one", "two", "three", "four", "five")
        );
        ArrayList<Character> charList = new ArrayList<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e')
        );

        gal.printArrayList(intList);
        gal.printArrayList(doubleList);
        gal.printArrayList(strList);
        gal.printArrayList(charList);
    }
}
