public class DeterminantCalculator {

    public static void main(String[] args) {
        int[][] matrix = {
            {6, 1, 1},
            {4, -2, 5},
            {2, 8, 7}
        };

        int result = determinant(matrix);
        System.out.println("Determinant: " + result);
    }

    // Function to calculate determinant
    static int determinant(int[][] matrix) {
        int n = matrix.length;

        // base case: 1x1 matrix
        if (n == 1) {
            return matrix[0][0];
        }

        // base case: 2x2 matrix
        if (n == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }

        int det = 0;

        // expand using row 0 (first row)
        for (int col = 0; col < n; col++) {
            int sign = (col % 2 == 0) ? 1 : -1;
            int[][] minor = getCofactor(matrix, 0, col);
            det += sign * matrix[0][col] * determinant(minor);
        }

        return det;
    }

    // Function to get cofactor matrix after removing row and column
    static int[][] getCofactor(int[][] matrix, int skipRow, int skipCol) {
        int n = matrix.length;
        int[][] cofactor = new int[n - 1][n - 1];

        int r = 0, c;

        for (int i = 0; i < n; i++) {
            if (i == skipRow) continue;
            c = 0;

            for (int j = 0; j < n; j++) {
                if (j == skipCol) continue;

                cofactor[r][c++] = matrix[i][j];
            }

            r++;
        }

        return cofactor;
    }
}
