import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int mph, hours;

        System.out.println("Enter the speed of the vehicle in mph:");
        mph = Integer.parseInt(scnr.nextLine());
        System.out.println("Enter the number of hours traveling:");
        hours = Integer.parseInt(scnr.nextLine());

        System.out.println("Hour     Distance Traveled");
        System.out.println("--------------------------");
        
        for (int i = 1; i <= hours; i++ ) {
            System.out.printf( "  %d             %d        \n", i, i*mph);
        }
    }
}
