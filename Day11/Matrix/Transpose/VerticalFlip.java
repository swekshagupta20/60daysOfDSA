public class VerticalFlip {

    //also known as column transpose 
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // swap elements horizontally across each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                // swap arr[i][j] with arr[i][cols - j - 1]
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols - j - 1];
                arr[i][cols - j - 1] = temp;
            }
        }

        // print the matrix
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
