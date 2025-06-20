
import java.util.Arrays;
import java.util.Scanner; 

public class binarySearch{


    public static int binarySearch(int[] arr, int val) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid;
            mid = (right + left) / 2;

            if (arr[mid] == val) {
                return mid; // Element found
            } else if (arr[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }



    public static void main (String [] args){

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the value to be searched: ");
        int val = input.nextInt();

        System.out.println("Enter the length of array: ");
        int len = input.nextInt();

        int [] arr = new int[len];

        System.out.println("Enter the array in which you want to searching operation: ");
        for (int i = 0; i < len; i++) {
            int x = input.nextInt();
            arr[i]= x;
        }

        // sort the array if not sorted 
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int result = binarySearch(arr, val);

        // Output result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        input.close();

    }
}
