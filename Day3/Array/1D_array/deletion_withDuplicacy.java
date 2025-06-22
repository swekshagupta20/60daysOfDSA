import java.util.Arrays;
import java.util.Scanner;

// We are deleting element's all occurrences from its position
// New array length would depend on frequency of element inside the original array
public class deletion_withDuplicacy {

    public static int[] DeleteElement(int[] arr, int x) {
        // x is the element to be deleted
        int freq = 0;

        // Count frequency of x
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                freq++;
            }
        }

        // If element not found
        if (freq == 0) {
            System.out.println("Error!! Element not found so cannot be deleted");
            return arr;
        }

        // Create new array of appropriate size
        int[] newArr = new int[arr.length - freq];

        // Copy elements except the one to delete
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != x) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }

    public static void main(String[] args) {

        Scanner val = new Scanner(System.in);

        // int [] arr = new int[5]; // do when we have to take inputs dynamically
        int arr[] = {10, 20, 30, 40, 50, 20, 10, 20};

        System.out.println("Enter the element you want to delete: ");
        int x = val.nextInt();

        // Deletion function
        int[] result = DeleteElement(arr, x);
        System.out.println("The array after deletion of element is: " + Arrays.toString(result));

        val.close(); // closing scanner class
    }
}
