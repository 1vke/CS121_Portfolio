import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double length1, length2, length3;

        System.out.print("Enter in the first length of the triangle: ");
        length1 = Double.parseDouble(scnr.nextLine());

        System.out.print("3Enter in the second length of the triangle: ");
        length2 = Double.parseDouble(scnr.nextLine());

        System.out.print("Enter in the third length of the triangle: ");
        length3 = Double.parseDouble(scnr.nextLine());

        if (length1 == length2 && length1 == length3) {
            System.out.print("This is a Equilateral triangle.");
        } else if (length1 == length2 || length1 == length3 || length2 == length3) {
            System.out.print("This is a Isosceles triangle.");
        } else {
            System.out.print("This is a Scalene triangle.");
        }
    }
}
