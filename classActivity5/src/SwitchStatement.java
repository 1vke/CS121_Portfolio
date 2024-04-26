import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        System.out.println("What is your favorite desert out of these choices?" +
                "\nIce Cream, Bomboloni, Cannoli, Tiramisu");
        userInput = scnr.nextLine();

        switch(userInput.toLowerCase()) {
            case "ice cream" -> System.out.println("\nPersonally I like gelato more.");
            case "bomboloni" -> System.out.println("\nGreat choice!");
            case "cannoli" -> System.out.println("\nThese slap no matter the price of them.");
            case "tiramisu" -> System.out.println("\nBit basic but I am still there for it!");
            default -> System.out.println("That is an invalid choice.");
        }
    }
}
