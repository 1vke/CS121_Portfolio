public class CFTable {
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit");
        System.out.println("**********************");
        for (int celsius = 0; celsius <= 20; celsius++) {
            System.out.printf( "  %d             %.1f    \n", celsius, getFahrenheit(celsius));
        }
    }
    public static double getFahrenheit(int celsius) {
        return (((double)9/5)*celsius) + 32;
    }
}
