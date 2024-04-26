import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numStudents, testsPerStudents;
        double testAvg;

        System.out.println("Enter number of students:");
        numStudents = Integer.parseInt(scnr.nextLine());
        System.out.println("Enter number of tests per students:");
        testsPerStudents = Integer.parseInt(scnr.nextLine());
        
        for (int i = 1; i <= numStudents; i++ ){
            testAvg = 0;
            System.out.printf("\nStudent number %d\n----------------\n",i);
            for (int j = 1; j <= testsPerStudents; j++) {
                System.out.printf("Enter score %d: ", j);
                testAvg += Double.parseDouble(scnr.nextLine());
            }
            testAvg /= testsPerStudents;
            System.out.printf("The average for student %d is %.2f\n", i, testAvg);
        }
    }
}
