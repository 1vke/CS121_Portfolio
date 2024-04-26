import java.util.Scanner;

public class CopyArray {
    public static void printArray(int[] array, int index) {
        System.out.printf("\nArray %d ", index + 1);
        switch (index) {
            case 1:
                System.out.println("- copy");
                break;
            case 2:
                System.out.println("- squared");
                break;
            case 3:
                System.out.println("- reversed");
                break;
            default:
                System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]); 
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number of array elements: ");
        final int NUM_ELEMENTS = Integer.parseInt(scnr.nextLine());
        int[][] arrays = new int[4][NUM_ELEMENTS];
        
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.printf("Enter array element %d: ", i);
            arrays[0][i] = Integer.parseInt(scnr.nextLine());
        }

        for(int i = 0; i < NUM_ELEMENTS; i++) {
            arrays[1][i] = arrays[0][i];
        }

        for(int i = 0; i < NUM_ELEMENTS; i++) {
            arrays[2][i] = (int)Math.pow((double) arrays[0][i], 2.0);
        }

        for(int i = 0; i < NUM_ELEMENTS; i++) {
            arrays[3][i] = arrays[0][(NUM_ELEMENTS - 1) - i];
        }

        for(int i = 0; i < arrays.length; i++) {
            printArray(arrays[i],i);
        }
    }
}
