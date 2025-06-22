import java.util.Arrays;
import java.util.Scanner;

public class searchInSortedJagged {

    // Method to search for an element in a jagged 2D array
    public static void searchElement(int[][] arr, int target) {
        boolean found = false;

        System.out.println("\nSearching for element: " + target);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at row " + i + ", column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found in the matrix.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
            {2, 3, 1},
            {3, 6, 5, 9},
            {0, 5},
            {4, 0, 5, 7, 8}
        };

        System.out.println("Our array without sorting: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Step 1: Calculate total elements
        int totalElements = 0;
        for (int[] row : arr) {
            totalElements += row.length;
        }

        // Step 2: Copy elements to new 1D array
        int[] newArr = new int[totalElements];
        int i = 0;
        for (int[] row : arr) {
            for (int elem : row) {
                newArr[i++] = elem;
            }
        }

        // Step 3: Sort newArr
        Arrays.sort(newArr);

        // Step 4: Put sorted values back into jagged matrix
        int x = 0;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = newArr[x++];
            }
        }

        // Step 5: Print sorted matrix
        System.out.println("\nOur array after sorting: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Step 6: Take user input and search
        System.out.print("\nEnter an element to search in the matrix: ");
        int searchKey = sc.nextInt();

        searchElement(arr, searchKey);
    }
}
