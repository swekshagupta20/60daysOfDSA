import java.util.Arrays;

// sorting entire matrix even if it is jagged (i.e., different number of elements in each row)
public class sortJaggedMatrix {
    public static void main(String[] args) {

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
        System.out.println("Our array after sorting: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
