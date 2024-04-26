import java.util.Scanner;

public class Sorting {
    Scanner scnr = new Scanner(System.in);

    public int[] getArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter integer %d: ", i+1);
            array[i] = scnr.nextInt();
        }
        return array;
    }

    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
