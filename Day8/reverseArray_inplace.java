public class reverseArray_inplace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Reverse the array in-place
        int i = 0, j = arr.length - 1;
        while (i < j) {
            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
