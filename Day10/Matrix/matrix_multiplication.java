import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size for matrix A
        System.out.print("Enter rows and columns of matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        // input size for matrix B
        System.out.print("Enter rows and columns of matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // check compatibility
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible. Columns of A must match rows of B.");
            return;
        }

        // declare matrices
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        // input matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // input matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // multiplication logic: A[r1][c1] × B[r2][c2] = result[r1][c2]
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // print result
        System.out.println("Matrix A x B:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(result[i][j] + "  ");
            System.out.println();
        }

        sc.close();
    }
}

