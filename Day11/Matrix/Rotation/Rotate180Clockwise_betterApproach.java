public class Rotate180Clockwise_betterApproach {

    //vertical flip -> horizontal flip 
    //180 anticlockwise is same logic as this 
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;
        int m = arr[0].length;

        // Vertical flip
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - i - 1][j];
                arr[n - i - 1][j] = temp;
            }
        }

        // Horizontal flip
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][m - j - 1];
                arr[i][m - j - 1] = temp;
            }
        }

        // print matrix
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
