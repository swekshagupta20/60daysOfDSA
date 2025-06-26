public class differenceArray_2D {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        int[][] darr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                darr[i][j] = arr[i][j];

                if (i > 0) {
                    darr[i][j] -= arr[i - 1][j];
                }
                if (j > 0) {
                    darr[i][j] -= arr[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    darr[i][j] += arr[i - 1][j - 1]; 
                }
            }
        }

        // Print the prefix matrix
        for (int[] r : darr) {
            for (int ele : r) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
