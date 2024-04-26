import javax.swing.*;

public class DialogBoxInterest {
    public static void main(String[] args) {
       double A, P, r, n;
       int t;

       P = Double.parseDouble(JOptionPane.showInputDialog("What is the original principal?"));
       r = Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?"))/100;
       n = Double.parseDouble(JOptionPane.showInputDialog("How many times per year is interest compounded?"));
       t = Integer.parseInt(JOptionPane.showInputDialog("For how many years will interest be compounded?"));
       A = P * Math.pow((1 + (r / n)), n * (double)t);

       JOptionPane.showMessageDialog(null, String.format("After %d years you will have $%.2f.", t, A));
    }
}
