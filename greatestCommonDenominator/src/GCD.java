public class GCD {
    public int findGCDForLoop(int a, int b) {
        int smallNum = Math.min(Math.abs(a), Math.abs(b)), gcd = 1;

        for (int i = 1; i <= smallNum; i++) {
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        return gcd;
    }
    public int findGCDWhileLoop(int a, int b) {
        int gcd = 1, count = 1;

        while (count <= Math.min(Math.abs(a), Math.abs(b))) {
            if (a % count == 0 && b % count == 0) gcd = count;
            count++;
        }

        return gcd;
    }
    public int findGCDRecursively(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        int temp = n2;
        n2 = n1 % n2;
        n1 = temp;

        if (n2 == 0) return n1;
        return findGCDRecursively(n1, n2);
    }
}
