public class Rotate90AntiClockwise {

    //Diagonal Transpose -> Vertical Flip 
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;

        // Diagonal transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Vertical flip: A[i][j] = A[n - i - 1][j]
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - i - 1][j];
                arr[n - i - 1][j] = temp;
            }
        }

        // print rotated matrix
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
