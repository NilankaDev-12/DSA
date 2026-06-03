import java.util.*;

public class Q4_Fibonacci {

    // 1. Fibonacci using ArrayList (Your Approach)
    public static void fibonacciArrayList(int range) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        for (int i = 2; i < range; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }

        System.out.print("ArrayList Approach: ");

        for (int i = 0; i < range; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }

    // 2. Iterative Approach (Most Optimal)
    public static void fibonacciIterative(int range) {

        int a = 0, b = 1;

        System.out.print("Iterative Approach: ");

        for (int i = 0; i < range; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // 3. Recursive Function
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Print Fibonacci using Recursion
    public static void printRecursiveSeries(int range) {

        System.out.print("Recursive Approach: ");

        for (int i = 0; i < range; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int range = 10;

        fibonacciArrayList(range);
        fibonacciIterative(range);
        printRecursiveSeries(range);
    }
}