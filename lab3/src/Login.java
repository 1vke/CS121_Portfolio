import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userName, password, name, pw;
        userName = "Luke";
        password = "Luke";

        System.out.print("Enter your username: ");
        name = scnr.nextLine();
        System.out.print("Enter your password: ");
        pw = scnr.nextLine();

        if (!name.equals(userName)) {
            System.out.println("Username incorrect!");
        } else {
            if (!pw.equals(password)) {
                System.out.println("Password incorrect!");
            } else {
                System.out.println("Welcome to CS121.");
            }
        }
    }
}
