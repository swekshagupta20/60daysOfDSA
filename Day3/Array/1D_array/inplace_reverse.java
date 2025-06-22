import java.util.Arrays;

public class inplace_reverse {

    // Function to reverse the array in-place
    public static void reverseInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(arr));
        
        reverseInPlace(arr);

        System.out.println("Array after in-place reversal: " + Arrays.toString(arr));
    }
}
