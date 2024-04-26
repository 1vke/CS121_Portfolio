import java.util.Random;
import java.util.Scanner;

public class ESP {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        String input, randColor;
        int correctAmount = 0;
        
        String[] colors = {"red", "green", "blue", "orange", "yellow"};
        
        for (int i = 1; i <= 10; i++) {
            randColor = colors[rand.nextInt(5)];
            
            System.out.printf("%d. What color has the computer chosen?\n", i);
            input = scnr.nextLine();
            
            if (input.toLowerCase().equals(randColor.toLowerCase())) {
                correctAmount++;
            }
            
            System.out.printf(">The computer chose %s\n",randColor);
        }

        System.out.printf("You got %d out of 10 correct", correctAmount);
    }
}
