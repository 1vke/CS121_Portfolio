import java.util.Random;

public class ArrayFromInput {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] firstNames = {"Oliver", "Sophia", "Liam", "Ava", "Noah", "Emma", "Jackson", "Olivia", "Lucas", "Isabella"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Martinez"};
        String[][] names = new String[10][2];
        int[] ages = new int[10];
        
        // Assign ages to random numbers
        for (int i = 0; i < 10; i++) {
            ages[i] = rand.nextInt(100) + 1;
            // Set first name
            names[i][0] = firstNames[rand.nextInt(10)];
            // Set last name
            names[i][1] = lastNames[rand.nextInt(10)];
        }

        System.out.printf("%-20s %s\n\n", "Name", "Age");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-20s %d\n", names[i][0] + " " + names[i][1], ages[i]);
        }
    }
}
