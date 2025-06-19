public class QuickSort {


    public static void quickSort(int[] arr, int p, int q) {
        if (p < q) {
            int pivotIndex = partition(arr, p, q);
            quickSort(arr, p, pivotIndex - 1);     // Sort left part
            quickSort(arr, pivotIndex + 1, q);     // Sort right part
        }
    }

    public static int partition(int[] arr, int p, int q) {
        int piv = arr[p];   // First element as pivot
        int left = p + 1;
        int right = q;

        while (true) {
            
            /*
             Here's why we use `while (true)` in the Hoare Partitioning method:

             - We don’t know in advance how many times the loop will run; it completely depends on the data.
             - We manually exit the loop using `break` when the condition `left >= right` is met, 
              which means the two pointers have crossed each other.
             - Using `while (true)` gives us full manual control. We can allow both `left` and `right`
             to scan inward properly and perform a comparison before deciding whether to swap or exit.
             */

            while (left <= right && arr[left] <= piv) {
                left++;  // Move p (left) until you find element > pivot
            }

            while (left <= right && arr[right] > piv) {
                right--; // Move q (right) until you find element < pivot
            }

            if (left >= right) {
                break;  // Pointers have crossed, exit loop
            }

            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // Swap pivot with arr[right]
        int temp = arr[p];
        arr[p] = arr[right];
        arr[right] = temp;

        return right;  // Return new pivot index
    }

    public static void main(String[] args) {
        int[] arr = {24, 9, 29, 14, 19, 27};

        System.out.println("Original array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
