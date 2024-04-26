import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter your name");
        name = keyboard.nextLine();
        System.out.println("name = " + name);
        System.out.println("Enter your age");
        age = Integer.parseInt(keyboard.nextLine());
        System.out.println("age = " + age);

    }
}