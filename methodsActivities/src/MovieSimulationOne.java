import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter in number of movies: ");
        final int NUM_MOVIES = Integer.parseInt(scnr.nextLine());
        
        String[] movieNames = new String[NUM_MOVIES];
        String[] movieTypes = new String[NUM_MOVIES];
        int[] movieAvailability = new int[NUM_MOVIES];
        double[] moviePrices = new double[NUM_MOVIES];

        for (int i = 0; i < NUM_MOVIES; i++) {
            System.out.printf("\nEnter in the following details for movie %d\n", i+1);
            
            System.out.print("Name: ");
            movieNames[i] = scnr.nextLine();
            System.out.print("Type: ");
            movieTypes[i] = scnr.nextLine();
            System.out.print("Available seats: ");
            movieAvailability[i] = Integer.parseInt(scnr.nextLine());
            System.out.print("Price: ");
            moviePrices[i] = Double.parseDouble(scnr.nextLine());
        }

        System.out.println("\n-------------------------------- Movie Details --------------------------------");
        System.out.printf("%-25s %-20s %-20s %-20s\n", "Movie Name", "Movie Type", "Available Seats", "Movie Price");
        
        for (int i = 0; i < NUM_MOVIES; i++) {
            printMovieListing(i, movieNames[i], movieTypes[i], movieAvailability[i], moviePrices[i]);
        }
    }
    public static void printMovieListing(int index, String name, String type, int availableSeats, double price) {
        System.out.printf("Movie %d: %-20s %-20s %-20d $%-20.2f\n", index + 1, name, type, availableSeats, price);
    }
}
