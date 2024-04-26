import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {
        char letterGrade = 'a';
        String output;
        double scoresAvg = 0;

        scoresAvg += Double.parseDouble(JOptionPane.showInputDialog("Enter the first test score"));
        scoresAvg += Double.parseDouble(JOptionPane.showInputDialog("Enter the second test score"));
        scoresAvg += Double.parseDouble(JOptionPane.showInputDialog("Enter the third test score"));
        scoresAvg /=3;

        if (scoresAvg < 60) {
            letterGrade = 'F';
        } else if (scoresAvg >= 60 && scoresAvg < 70) {
            letterGrade = 'D';
        } else if (scoresAvg >= 70 && scoresAvg < 80) {
            letterGrade = 'C';
        } else if (scoresAvg >= 80 && scoresAvg < 90) {
            letterGrade = 'B';
        } else if (scoresAvg >= 90) {
            letterGrade = 'A';
        }

        output = String.format("Your test score average is %.1f\nYour letter grade is %c", scoresAvg, letterGrade);
        JOptionPane.showMessageDialog(null, output);

    }
}
