import java.util.Arrays;
import java.util.Scanner;

public class binarySearch_recursive {

    // Recursive binary search function
    public static int BSR(int[] arr, int left, int right, int val) {
        if (left > right) {
            return -1; // base case: element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == val) {
            return mid;
        } else if (arr[mid] < val) {
            return BSR(arr, mid + 1, right, val);
        } else {
            return BSR(arr, left, mid - 1, val);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the value to be searched
        System.out.print("Enter the value to be searched: ");
        int val = input.nextInt();

        // Input the array size
        System.out.print("Enter the length of array: ");
        int len = input.nextInt();

        // Declare array
        int[] arr = new int[len];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }

        // Sort the array before binary search
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Perform recursive binary search
        int result = BSR(arr, 0, len - 1, val);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        input.close();
    }
}
