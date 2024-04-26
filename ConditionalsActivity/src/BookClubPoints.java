import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args) {
        int booksPurchased, points;
        String output;

        booksPurchased = Integer.parseInt(JOptionPane.showInputDialog("Enter number of books"));

        if (booksPurchased == 0) {
            points = 0;
        } else if (booksPurchased == 1) {
            points = 5;
        } else if (booksPurchased == 2) {
            points = 15;
        } else if (booksPurchased == 3) {
            points = 30;
        } else if (booksPurchased >= 4) {
            points = 60;
        } else {
            points = -1;
        }

        output = String.format("The books entered: %d\nThe points earned is: %d", booksPurchased, points);
        JOptionPane.showMessageDialog(null, output);
    }
}
