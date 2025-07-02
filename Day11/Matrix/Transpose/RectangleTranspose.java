public class RectangleTranspose {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Create new matrix with flipped dimensions
        int[][] transposed = new int[cols][rows];

        // Place arr[i][j] → transposed[j][i]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        // print the matrix
        for (int[] row : transposed) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
