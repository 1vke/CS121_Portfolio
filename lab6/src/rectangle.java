import java.util.Scanner;

public class rectangle {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        double rectLength, rectWidth, rectArea;

        rectLength = getLength();
        rectWidth = getWidth();
        rectArea = getArea(rectLength, rectWidth);
        displayData(rectLength, rectWidth, rectArea);
        scnr.close();
    }
    public static double getLength() {
        System.out.print("Enter the length of a rectangle: ");
        return Double.parseDouble(scnr.nextLine());
    }
    public static double getWidth() {
        System.out.print("Enter the width of a rectangle: ");
        return Double.parseDouble(scnr.nextLine());
    }
    public static double getArea(double l, double w){
        return (double)l*w;
    }
    public static void displayData(double rectLength, double rectWidth, double rectArea){
        System.out.printf("Rectangle length: %.2f\n", rectLength);
        System.out.printf("Rectangle width: %.2f\n", rectWidth);
        System.out.printf("Rectangle area: %.2f\n", rectArea);
    }
}
