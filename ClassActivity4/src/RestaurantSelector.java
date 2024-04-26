import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char vegetarian, vegan, glutenFree;
        String restaurantsOutput = "\nJoe’s Gourmet Burgers\nMain Street Pizza Company\nCorner Café\nMama’s Fine Italian\nThe Chef’s Kitchen";

        System.out.println("Is there anyone in your party that is vegetarian?");
        vegetarian = scnr.nextLine().charAt(0);
        System.out.println("Is there anyone in your party that is vegan?");
        vegan = scnr.nextLine().charAt(0);
        System.out.println("Is there anyone in your party that is gluten-free?");
        glutenFree = scnr.nextLine().charAt(0);

        if (vegetarian == 'y'){
            restaurantsOutput = restaurantsOutput.replace("\nJoe’s Gourmet Burgers","");
        }
        if (vegan == 'y') {
            restaurantsOutput = restaurantsOutput.replace("\nJoe's Gourmet Burgers","");
            restaurantsOutput = restaurantsOutput.replace("\nMain Street Pizza Company","");
            restaurantsOutput = restaurantsOutput.replace("\nMama’s Fine Italian","");

        }
        if (glutenFree == 'y'){
            restaurantsOutput = restaurantsOutput.replace("\nJoe's Gourmet Burgers","");
            restaurantsOutput = restaurantsOutput.replace("\nMama’s Fine Italian","");
        }

        System.out.println("Here are your restaurant choices:" + restaurantsOutput);
    }
}
