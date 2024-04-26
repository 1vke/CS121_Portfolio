import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = Integer.parseInt(scnr.nextLine());

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
