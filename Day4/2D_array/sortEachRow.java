import java.util.Arrays;

public class sortEachRow {


    public static void main(String[] args) {

        int[][] arr = {
            {2, 3, 1},
            {3, 6, 5, 9},
            {0, 5},
            {4, 0, 5, 7, 8}
        };

        System.out.println("Our array before row-wise sorting: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Sorting each row individually
        for (int[] row : arr) {
            Arrays.sort(row);
        }

        // Printing sorted matrix
        System.out.println("Our array after row-wise sorting: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}
