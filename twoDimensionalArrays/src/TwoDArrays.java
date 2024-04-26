public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        double[][] array2 = new double[4][3];
        String[][] array3 = {{"Ann", "Andy", "Andrea"},{"Joe", "John", "Joanna"}};

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (j+1) + (i*3);
                array2[i][j] += (array2[i][j]*.1) % 1;
            }
        }
        
        System.out.println("Array 1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.printf("%d ", array1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nArray 2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.printf("%.1f ", array2[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nArray 3");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.printf("%s ", array3[i][j]);
            }
            System.out.println();
        }
    }
}
