import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scnr = new Scanner(System.in);
        File contactsFile = new File("contacts.txt");
        PrintWriter output = new PrintWriter(contactsFile);
        
        output.write("");
        
        output.printf("%-20s %-20s %-20s\n", "Name", "Nickname", "PhoneNumber");
        
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
