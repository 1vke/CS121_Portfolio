public class test {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", true, 5, "red");
        Flower daisy = new Flower("Daisy", false, 9, "yellow");
        Student derek = new Student("Derek", 13, 3.93, "Math");
        Student alice = new Student("Alice", 14, 3.55, "English");
        
        rose.printAttributes();
        daisy.printAttributes();
        derek.print();
        alice.print();
    }
}
