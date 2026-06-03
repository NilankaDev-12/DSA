public class Q1_Factorial {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException(
                    "Factorial is not defined for negative numbers");
        }

        if (num == 0 || num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Q1_Factorial obj = new Q1_Factorial();

        int result = obj.factorial(5);

        System.out.println("Factorial = " + result);
    }
}

/* 
    factorial(5)
    = 5 * factorial(4)
    = 5 * 4 * factorial(3)
    = 5 * 4 * 3 * factorial(2)
    = 5 * 4 * 3 * 2 * factorial(1)
    = 5 * 4 * 3 * 2 * 1
    = 120 
*/