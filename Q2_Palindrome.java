public class Q2_Palindrome {
    public static boolean isPalindrome_number(int num) {
        int n = num, rev = 0, d;

        while (n > 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        return num == rev;
    }

    public static boolean isPalindrome_string(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        int num = 151;
        String str = "ZOOZ";

        System.out.println(
                isPalindrome_number(num)
                        ? "Palindrome Number"
                        : "Not a Palindrome Number");

        System.out.println(
                isPalindrome_string(str)
                        ? "Palindrome String"
                        : "Not a Palindrome String");
    }
}
