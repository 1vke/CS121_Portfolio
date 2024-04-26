import java.util.Scanner;

public class ScannerInterest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double A, P, r, n;
        int t;

        System.out.print("What is the original principal? ");
        P = Double.parseDouble(scnr.nextLine());

        System.out.print("What is the annual interest rate? ");
        r = Double.parseDouble(scnr.nextLine())/100;

        System.out.print("How many times per year is interest compounded? ");
        n = Double.parseDouble(scnr.nextLine());

        System.out.print("For how many years will interest be compounded? ");
        t = Integer.parseInt(scnr.nextLine());

        A = P * Math.pow((1 + (r / n)), n * (double)t);
        System.out.println(String.format("After %d years you will have $%.2f.", t, A));
    }
}
