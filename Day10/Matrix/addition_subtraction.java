public class addition_subtraction {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int n = A.length;

        int[][] sum = new int[n][n];
        int[][] diff = new int[n][n];

        //Addition and Subtraction
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                diff[i][j] = A[i][j] - B[i][j];
            }
        }

        //Print results
        System.out.println("Matrix A + B:");
        printMatrix(sum);

        System.out.println("\nMatrix A - B:");
        printMatrix(diff);
    }

    //method to print matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }
    }
}
