import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File contactsFile = new File("contacts.txt");

        Scanner scnr = new Scanner(contactsFile);
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            System.out.println(line);
        }
    }
}
