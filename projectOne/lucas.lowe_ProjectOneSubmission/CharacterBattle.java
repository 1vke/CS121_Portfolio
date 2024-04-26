import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rounds, player1, player2;
        int[] hp = new int[2], movePower = new int[2], attackSpeed = new int[2], wins = new int[2];
        String[] name = new String[2], moveName = new String[2];
        
        player1 = 0;
        player2 = 1;
        
        while (true) {
            System.out.print("Enter odd number of rounds: ");
            rounds = Integer.parseInt(scnr.nextLine());
            if (rounds % 2 == 1 && rounds > 0 ) break;
            else System.out.println("The number must be odd and positive!");
        }

        for (int i = 1; i <= rounds; i++) {
            System.out.printf("Round %d:\n------------\n", i);
            for (int playerIndex = 0; playerIndex <= 1; playerIndex++) {
                System.out.printf("Player %d: Select a Character and enter its stats\n", (playerIndex + 1));

                System.out.println("Enter name:");
                name[playerIndex] = scnr.nextLine();

                System.out.println("Enter HP:");
                hp[playerIndex] = Integer.parseInt(scnr.nextLine());

                System.out.println("Enter move name:");
                moveName[playerIndex] = scnr.nextLine();

                System.out.println("Enter move's power:");
                movePower[playerIndex] = Integer.parseInt(scnr.nextLine());

                System.out.println("Enter attack speed:");
                attackSpeed[playerIndex] = Integer.parseInt(scnr.nextLine());

                System.out.println();
            }
            
            boolean battling = true;
            while (battling) {
                int fastPlayer, slowPlayer;
                int winningPlayer = -1;
                
                if (attackSpeed[player1] > attackSpeed[player2]) {
                    fastPlayer = player1;
                    slowPlayer = player2;
                }
                else {
                    fastPlayer = player2;
                    slowPlayer = player1;
                }
                
                hp[slowPlayer] -= movePower[fastPlayer];
                if (hp[slowPlayer] <= 0) { winningPlayer = fastPlayer; } 
                else {
                    hp[fastPlayer] -= movePower[slowPlayer];
                    if (hp[fastPlayer] <= 0) { winningPlayer = slowPlayer; }
                }
                
                if (winningPlayer != -1) {
                    battling = false;
                    wins[winningPlayer]++;
                    System.out.printf("Player %d: %s wins this round!\n\n", (winningPlayer + 1), name[winningPlayer]);
                    System.out.printf("wins:\nPlayer 1 Wins: %d\nPlayer 2 Wins: %d\n\n", wins[player1], wins[player2]);
                }
            }
        }

        System.out.printf("Final Scores:\nPlayer 1 Wins: %d\nPlayer 2 Wins: %d\n\n", wins[player1], wins[player2]);
        if (wins[player1] > wins[player2]) {
            System.out.println("Player 1 has won the game!");
        } else if (wins[player2] > wins[player1]) {
            System.out.println("Player 2 has won the game!");
        } else {
            System.out.println("The game was a tie!");
        }
    }
}
