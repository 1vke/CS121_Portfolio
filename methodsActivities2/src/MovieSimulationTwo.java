import java.util.Random;
import java.util.Scanner;

public class MovieSimulationTwo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] movieNames = {"Matrix", "Spiderman", "Polar Express", "Halloween"};
        String[] movieTypes = {"3D", "2D", "3D", "2D"};
        double[] moviePrices = {19.23, 20, 12.32, 23.45};
        final int ROWS = 5;
        final int COLS = 10;
        final int NUM_MOVIES = 4;
        int[][] movieAvailability = new int[ROWS][COLS];

        System.out.println("\n-------------------------------- Movie Details --------------------------------");
        System.out.printf("%-25s %-20s %-20s\n", "Movie Name", "Movie Type", "Movie Price");

        for (int i = 0; i < NUM_MOVIES; i++) {
            printMovieListing(i, movieNames[i], movieTypes[i], moviePrices[i]);
        }
        
        setSeatAvailability(movieAvailability);
        
        System.out.println("\n---------------------------- INITIAL SEATS ----------------------------\n");
        displaySeatAvailability(movieAvailability);
        
        randomizeAvailability(movieAvailability);
        
        System.out.println("\n---------------------------- RANDOM GENERATED SEATS ----------------------------\n");
        displaySeatAvailability(movieAvailability);
    }
    public static void printMovieListing(int index, String name, String type, double price) {
        System.out.printf("Movie %d: %-20s %-20s $%-20.2f\n", index + 1, name, type, price);
    }
    public static void setSeatAvailability(int[][] seatAvailability) {
        for (int i = 0; i < seatAvailability.length; i++) {
            for (int j = 0; j < seatAvailability[i].length; j++) {
                seatAvailability[i][j] = 0;
            }
        }
    }
    public static void displaySeatAvailability(int[][] seatAvailability) {
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available]\n");
        for (int i = 0; i < seatAvailability.length; i++) {
            for (int j = 0; j < seatAvailability[i].length; j++) {
                System.out.printf("%-3d", seatAvailability[i][j]);
            }
            System.out.println();
        }
    }
    public static void randomizeAvailability(int[][] seatAvailability) {
        Random rnd = new Random();
        for (int i = 0; i < seatAvailability.length; i++) {
            for (int j = 0; j < seatAvailability[i].length; j++) {
                seatAvailability[i][j] = rnd.nextInt(2);
            }
        }
    }
}
