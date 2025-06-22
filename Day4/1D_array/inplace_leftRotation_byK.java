import java.util.Arrays;
import java.util.Scanner;

public class inplace_leftRotation_byK {

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

    // In-place Left Rotation by k positions
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;

        if(k > n) {
            k = k % n;
        }

        // Step 1: Reverse first k elements
        reverseArray(arr, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverseArray(arr, k, n - 1);

        // Step 3: Reverse the whole array
        reverseArray(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k for left rotation: ");
        int k = sc.nextInt();
        sc.close();

        leftRotate(arr, k);

        System.out.println("The array after in-place left rotation by " + k + " positions is: " + Arrays.toString(arr));
    }
}
