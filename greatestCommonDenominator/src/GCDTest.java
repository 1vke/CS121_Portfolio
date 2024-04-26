public class GCDTest {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.findGCDForLoop(-12, -8));
        System.out.println(gcd.findGCDWhileLoop(81, -153));
        System.out.println(gcd.findGCDRecursively(-366, 60));
    }
}
