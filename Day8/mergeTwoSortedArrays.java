//merge two sorted arrays, use one pointer for one array 
// merge into array which has bigger size 
// sorting in reverse order to avoid reassigning elements 
import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoSortedArrays {

    public static int[] merge(int[] arr1, int m, int[] arr2, int n) {
        // We assume arr1 has enough space to hold all elements
        int i = m - 1; // Last index of real elements in arr1
        int j = n - 1; // Last index of arr2
        int k = m + n - 1; // Last index of merged array

        // Merge in reverse order to avoid overwriting elements in arr1
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // If arr2 still has elements
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[30]; // Bigger array to hold both arrays
        int m = 8; // Number of actual elements to input

        System.out.println("Enter 8 sorted elements for arr1:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = {13, 65, 43, 35, 24, 74, 26};
        int n = arr2.length;

        Arrays.sort(arr1, 0, m); // Sort only the valid part
        Arrays.sort(arr2);       // Sort arr2

        int[] merged = merge(arr1, m, arr2, n);

        System.out.println("Merged sorted array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
