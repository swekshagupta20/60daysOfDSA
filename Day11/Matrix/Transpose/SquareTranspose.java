public class SquareTranspose {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;

        // Swapping elements across diagonal (i < j)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // swap arr[i][j] with arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // print the matrix
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
