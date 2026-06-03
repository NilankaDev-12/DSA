public class Q6_BinarySearch {

    // Iterative process
    public static int[] binarySearch(int[] arr, int key) {
        if (arr.length < 1) {
            System.out.println("Array is empty");
            return new int[] { -1, -1 };
        }
        if (arr.length == 1 && arr[0] == key)
            return new int[] { 0, arr[0] };

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return new int[] { mid, arr[mid] };
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int[] result = binarySearch(arr, 40);

        if (result[0] != -1) {
            System.out.println("Index: " + result[0] + " Value: " + result[1]);
        } else
            System.out.println("No match is found");
    }
}
