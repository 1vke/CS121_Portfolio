import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of floors");
        final int NUM_FLOORS = Integer.parseInt(scnr.nextLine());
        int[][] ROOMS = new int[NUM_FLOORS][2];
        int totalRooms = 0, occupiedRooms = 0;
        
        
        
        for (int i = 0; i < NUM_FLOORS; i++) {
            System.out.printf("Enter number of rooms on floor %d\n", i + 1);
            ROOMS[i][0] = Integer.parseInt(scnr.nextLine());
            System.out.println("How many of the floor's rooms are occupied?");
            ROOMS[i][1] = Integer.parseInt(scnr.nextLine());
        }

        System.out.printf("Floors: %d\n", NUM_FLOORS);
        
        for (int i = 0; i < NUM_FLOORS; i++) {
            totalRooms += ROOMS[i][0];
            occupiedRooms += ROOMS[i][1];
        }
        System.out.printf("Rooms: %d\n", totalRooms);
        System.out.printf("Occupied Rooms: %d\n", occupiedRooms);
        System.out.printf("Vacant Rooms: %d\n", totalRooms - occupiedRooms);
        System.out.printf("Occupancy: %.2f (%.0f%%)", (double)occupiedRooms/totalRooms, ((double)occupiedRooms/totalRooms) * 100);
    }
}
