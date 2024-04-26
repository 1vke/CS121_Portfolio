import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MovieSimulationFour {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLS = 10;
        final int NUM_MOVIES = 4;
        
        String[] movieNames = {"Matrix", "Spiderman", "Polar Express", "Halloween"};
        String[] movieTypes = {"3D", "2D", "3D", "2D"};
        double[] moviePrices = {19.23, 20, 12.32, 23.45};
        int[][] movieAvailability = new int[ROWS][COLS];
        int selectedMovie = -1;

        System.out.println("\n-------------------------------- Movie Details --------------------------------");
        System.out.printf("%-25s %-20s %-20s\n", "Movie Name", "Movie Type", "Movie Price");
        for (int i = 0; i < NUM_MOVIES; i++) {
            printMovieListing(i, movieNames[i], movieTypes[i], moviePrices[i]);
        }

        selectedMovie = selectMovie(movieNames);

        System.out.println("\n---------------------------- MOVIE SELECTION ----------------------------");
        System.out.printf("%-25s %-20s %-20s\n", "Movie Name", "Movie Type", "Movie Price");
        printMovieListing(selectedMovie, movieNames[selectedMovie], movieTypes[selectedMovie], moviePrices[selectedMovie]);

        randomizeAvailability(movieAvailability);
        System.out.println("\n---------------------------- AVAILABLE SEATS ----------------------------\n");
        displaySeatAvailability(movieAvailability);

        selectSeats(movieAvailability);
        
        scnr.close();
    }
    public static void selectSeats(int[][] movieAvailability) {
        boolean gettingInput = true;
        int numTickets = 0;
        
        while (gettingInput) {
            System.out.print("\nEnter the number of tickets you'd like to purchase: ");
            numTickets = Integer.parseInt(scnr.next());
            if (numTickets <= 0) System.out.println("Please choose a valid amount of tickets");
            else gettingInput = false;
        }

        for (int i = 1; i <= numTickets; i++) {
            String seat;
            gettingInput = true;
            while (gettingInput) {
                System.out.printf("Please pick an available seat (e.g., A2) for ticket %d: ", i);
                seat = scnr.next();
                
                int rowIndex = seat.charAt(0) - 65;
                int colIndex = Integer.parseInt(seat.substring(1,seat.length())) - 1;
                
                if ((movieAvailability.length > rowIndex && rowIndex >= 0) && (movieAvailability[0].length > colIndex && colIndex >= 0) ) {
                    if (movieAvailability[rowIndex][colIndex] != 1) {
                        movieAvailability[rowIndex][colIndex] = 1;
                        System.out.printf("\nYou have succesfully booked seat %s\n", seat);
                        gettingInput = false;
                    } else System.out.printf("\nSeat %s is already booked, try again!\n", seat);
                } else System.out.println("\nSeat does not exist, try again!");
            }
        }

        System.out.println("All seats are booked, enjoy your movie!");
    }
    public static int selectMovie(String[] movieNames) {
        boolean selectingMovie = true;
        int selectedMovie = -1;
        while (selectingMovie) {
            System.out.print("Enter the movie name you are purchasing tickets for: ");
            String input = scnr.next();

            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].toLowerCase().equals(input.toLowerCase())) {
                    selectedMovie = i;
                }
            }

            if (selectedMovie != -1) selectingMovie = false;
            else System.out.println("Movie not found! Please try again.\n");
        }
        return selectedMovie;
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
        System.out.print("   ");

        String[] letters = {"A", "B", "C", "D", "E", "F", "G"};

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%-3d",i);
        }

        System.out.print("\n  ------------------------------\n");

        for (int i = 0; i < seatAvailability.length; i++) {
            System.out.printf("%s |", letters[i]);
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
