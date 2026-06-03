public class Q3_GCD_LCM {

    // Iterative GCD (Euclidean Algorithm)
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Recursive GCD (Euclidean Algorithm)
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcdRecursive(b, a % b);
    }

    /*
        Recursive Trace:

        gcd(48, 18)
        = gcd(18, 12)
        = gcd(12, 6)
        = gcd(6, 0)
        = 6
    */

    // LCM using Iterative GCD
    public static int lcmIterative(int a, int b) {
        return (a * b) / gcdIterative(a, b);
    }

    // LCM using Recursive GCD
    public static int lcmRecursive(int a, int b) {
        return (a * b) / gcdRecursive(a, b);
    }

    public static void main(String[] args) {

        int a = 48;
        int b = 18;

        System.out.println("Iterative GCD = " + gcdIterative(a, b));
        System.out.println("Recursive GCD = " + gcdRecursive(a, b));

        System.out.println("Iterative LCM = " + lcmIterative(a, b));
        System.out.println("Recursive LCM = " + lcmRecursive(a, b));
    }
}