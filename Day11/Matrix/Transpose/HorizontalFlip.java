public class HorizontalFlip {

    //also known as row transpose
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // flip rows by swapping top and bottom
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < cols; j++) {
                // swap arr[i][j] with arr[rows - i - 1][j]
                int temp = arr[i][j];
                arr[i][j] = arr[rows - i - 1][j];
                arr[rows - i - 1][j] = temp;
            }
        }

        // print the matrix
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
