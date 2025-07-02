public class CofactorMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 1},
            {1, 1, 2},
            {2, 3, 1}
        };

        int[][] cofactorMatrix = getCofactorMatrix(matrix);

        System.out.println("Cofactor Matrix:");
        for (int[] row : cofactorMatrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    // Function to compute full cofactor matrix
    static int[][] getCofactorMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] cofactors = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int sign = ((row + col) % 2 == 0) ? 1 : -1;
                int[][] minor = getMinor(matrix, row, col);
                int minorDet = determinant(minor);
                cofactors[row][col] = sign * minorDet;
            }
        }

        return cofactors;
    }

    // Helper to get minor of a matrix by removing one row and one column
    static int[][] getMinor(int[][] matrix, int skipRow, int skipCol) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];
        int r = 0, c;

        for (int i = 0; i < n; i++) {
            if (i == skipRow) continue;
            c = 0;

            for (int j = 0; j < n; j++) {
                if (j == skipCol) continue;

                minor[r][c++] = matrix[i][j];
            }

            r++;
        }

        return minor;
    }

    // Recursive determinant function
    static int determinant(int[][] matrix) {
        int n = matrix.length;

        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        int det = 0;
        for (int col = 0; col < n; col++) {
            int sign = (col % 2 == 0) ? 1 : -1;
            det += sign * matrix[0][col] * determinant(getMinor(matrix, 0, col));
        }

        return det;
    }
}
