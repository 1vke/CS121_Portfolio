public class Flower {
    private boolean isAlive;
    private int numPetals;
    private String color, name;
    
    public Flower(String name, boolean isAlive, int numPetals, String color) {
        this.name = name;
        this.isAlive = isAlive;
        this.numPetals = numPetals;
        this.color = color;
    }
    
    public void printAttributes() {
        System.out.printf("Flower:\n    Name: %s\n    Alive: %b\n    # of Petals: %d\n    Color: %s\n", this.name, this.isAlive, this.numPetals, this.color);
    }
}
