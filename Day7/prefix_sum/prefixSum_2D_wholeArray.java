public class prefixSum_2D_wholeArray {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        int[][] prefix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefix[i][j] = arr[i][j];

                if (i > 0) {
                    prefix[i][j] += prefix[i - 1][j];
                }
                if (j > 0) {
                    prefix[i][j] += prefix[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    prefix[i][j] -= prefix[i - 1][j - 1]; 
                }
            }
        }

        // Print the prefix matrix
        for (int[] r : prefix) {
            for (int ele : r) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
