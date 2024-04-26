import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scnr = new Scanner(System.in);
    static Pokedex pkdx = new Pokedex();
    
    public void displayMenu() {
        boolean choosing = true;
        
        while(choosing) {
            System.out.println("********** MENU **********");
            System.out.println("Please Make a selection:");
            
            System.out.print("1) Add a Pokemon\n2) Remove a Pokemon\n3) Display Pokemon Info\n4) Display All Pokemon Info\n5) Exit\n>> ");
            switch (scnr.nextLine()) {
                case "1" -> createPokemon();
                case "2" -> deletePokemon();
                case "3" -> displayPokemon();
                case "4" -> displayAllPokemon();
                case "5" -> choosing = false;
            }
        }
    }

    private void displayAllPokemon() {
        ArrayList<Pokemon> pokemons = pkdx.getPokemonArrayList();
        
        for(Pokemon pm : pokemons) {
            System.out.println(pm.toString());
        }
    }

    private void displayPokemon() {
        String name;

        System.out.print("Enter name of Pokemon to diplay info for: ");
        name = scnr.nextLine();

        if(pkdx.getPokemon(name) == null) {
            System.out.println("Pokemon not found");
        } else {
            System.out.println(pkdx.getPokemon(name).toString());
        }
    }

    private void deletePokemon() {
        String name;

        System.out.print("Enter name of Pokemon to delete: ");
        name = scnr.nextLine();
        
        if(pkdx.getPokemon(name) == null) {
            System.out.println("Pokemon not found");
        } else {
            pkdx.removePokemon(pkdx.getPokemon(name));
        }
    }

    private void createPokemon() {
        Pokemon userPk;
        String name;
        int hp;

        System.out.print("Enter the Pokemon name: ");
        name = scnr.nextLine();

        System.out.print("Enter the Pokemon hp: ");
        hp = Integer.parseInt(scnr.nextLine());
        
        userPk = new Pokemon(name, hp);
        
        System.out.printf("Enter Moves for %s:\n", name);
        while(true) {
            Move userMv;
            String moveName;
            int movePower, moveSpeed;
            
            System.out.print("    Enter a Move name or q if finished: ");
            moveName = scnr.nextLine();
            if (moveName.equals("q")) break;

            System.out.print("    Enter move's power: ");
            movePower = Integer.parseInt(scnr.nextLine());

            System.out.print("    Enter move's speed: ");
            moveSpeed = Integer.parseInt(scnr.nextLine());
            
            userMv = new Move(moveName, movePower, moveSpeed);
            userPk.addMove(userMv);
        }
        
        pkdx.addPokemon(userPk);
        System.out.println("Pokemon has been added to the Pokedex");
    }
}
