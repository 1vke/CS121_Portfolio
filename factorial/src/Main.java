public class Main {
    static int factorial(int n) {
        if (n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 30;
        int result;
        result=factorial(n);
        System.out.printf("Factorial of %d is %d", n, result);
    }
}
