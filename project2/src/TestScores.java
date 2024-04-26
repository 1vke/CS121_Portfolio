import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        
        final int SIZE = rand.nextInt(7) + 4;

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.printf("Enter your %d test scores:\n", SIZE);
        
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Enter test %d score: ", i + 1);
            testScores[i] = Integer.parseInt(scnr.nextLine());
            letterGrades[i] = getLetterGrade(testScores[i]);
        }
        
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
        
        scnr.close();
    }
    public static char getLetterGrade(int testScore) {
        char letterGrade = ' ';
        if (testScore >= 90) {
            letterGrade = 'A';
        } else if (testScore >= 80) {
            letterGrade = 'B';
        } else if (testScore >= 70) {
            letterGrade = 'C';
        } else if (testScore >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
    public static void printGrades(int[] testScores, char[] letterGrades) {
        System.out.println("\nScore  Grade");
        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("  %d     %c  \n", testScores[i], letterGrades[i]);
        }
    }
    public static void printLowestScore(int[] testScores) {
        int lowestInt = 200;
        for(int testScore : testScores) {
            if (lowestInt >= testScore) lowestInt = testScore;
        }
        System.out.printf("The lowest score is %d\n", lowestInt);
    }
    public static void printHighestScore(int[] testScores) {
        int highestInt = 0;
        for(int testScore : testScores) {
            if (highestInt <= testScore) highestInt = testScore;
        }
        System.out.printf("The highest score is %d\n", highestInt);
    }
    public static void printAverageScore(int[] testScores) {
        double average = 0;
        for (int testScore : testScores) average += testScore;
        average /= testScores.length;
        System.out.printf("The average score is %.2f\n", average);
    }
}