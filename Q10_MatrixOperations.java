import java.util.Scanner;

public class Q10_MatrixOperations {

    public static void display(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[][] arr = new int[4][3];

        int[][] m = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] t = new int[m[0].length][m.length];

        Scanner sc = new Scanner(System.in);

        /*
         * // Take inputs
         * for(int i = 0 ; i < 4 ; i ++) {
         * for(int j = 0 ; j < 3 ; j ++) {
         * System.out.print("Enter the value for ("+i+","+j+") index : ");
         * arr[i][j] = sc.nextInt();
         * }
         * }
         * 
         * // Printing the output
         * for(int i = 0 ; i < 4 ; i ++) {
         * for(int j = 0 ; j < 3 ; j ++) {
         * System.out.print(arr[i][j]+"  ");
         * }
         * System.err.println();
         * }
         */

        // Before transpose
        display(m);

        // Transpose
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }

        System.out.println();

        // After transpose
        display(t);

        System.out.println("\nMatrix Multiplication (m x t):");

        int[][] result = new int[m.length][t[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < t[0].length; j++) {

                int sum = 0;

                for (int k = 0; k < m[0].length; k++) {
                    sum += m[i][k] * t[k][j];
                }

                result[i][j] = sum;
            }
        }

        display(result);

    }
}
