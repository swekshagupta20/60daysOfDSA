import java.util.Arrays;
import java.util.Scanner;

public class inplace_rightRotation_byK {

    // Function to reverse elements in the array from start to end index
    public static void reverseArray(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // In-place Right Rotation by k positions
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;

        // Handle k > n case
        if(k > n) {
            k = k % n;
        }

        // Step 1: Reverse the last k elements
        reverseArray(arr, n - k, n - 1);

        // Step 2: Reverse the first n-k elements
        reverseArray(arr, 0, n - k - 1);

        // Step 3: Reverse the whole array
        reverseArray(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k for right rotation: ");
        int k = sc.nextInt();
        sc.close();

        rightRotate(arr, k);

        System.out.println("The array after in-place right rotation by " + k + " positions is: " + Arrays.toString(arr));
    }
}
