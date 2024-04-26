import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        int[] array = sorting.getArray();
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        array = sorting.sortArray(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
