import java.io.*;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        FileWriter contactsWriter = new FileWriter("contacts.txt", true);
        PrintWriter output = new PrintWriter(contactsWriter);
        
        while (true) {
            String name, nickname, phoneNumber;

            System.out.print("Enter in a name or q to quit: ");
            name = scnr.nextLine();
            if (name.equals("q")) break;

            System.out.print("Enter in a nickname: ");
            nickname = scnr.nextLine();

            System.out.print("Enter in a phone number: ");
            phoneNumber = scnr.nextLine();

            output.printf("%-20s %-20s %-20s\n", name, nickname, phoneNumber);
        }
        output.close();
    }
}
