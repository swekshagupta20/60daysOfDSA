import java.util.Arrays;

/* we cannot use jagged matrix or else we will have to use 0 as an entry for the
   indexes at which value is not available 
*/
public class sortEachColumn {
    public static void main(String[] args) {

        int[][] arr = {
            {2, 3, 1},
            {3, 6, 5},
            {0, 5, 7},
            {4, 0, 8}
        };

        System.out.println("Original matrix:");
        printMatrix(arr);

        int rows = arr.length;
        int cols = arr[0].length;

        // Sort each column individually
        for (int i = 0; i < cols; i++) {
            int[] temp = new int[rows];

            // Extract column elements into temp
            for (int j = 0; j < rows; j++) {
                temp[j] = arr[j][i];
            }

            // Sort the column
            Arrays.sort(temp);

            // Put sorted column back
            for (int j = 0; j < rows; j++) {
                arr[j][i] = temp[j];
            }
        }

        System.out.println("\nMatrix after column-wise sorting:");
        printMatrix(arr);
    }

    // Utility method to print a 2D matrix
    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}