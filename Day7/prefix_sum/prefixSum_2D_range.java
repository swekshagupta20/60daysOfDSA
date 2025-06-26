import java.util.Scanner;

public class prefixSum_2D_range{

    // Function to compute 2D prefix sum matrix
    public static int[][] computePrefixSum(int[][] arr) {
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
        return prefix;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call function to compute prefix sum matrix
        int[][] prefix = computePrefixSum(arr);

        // Optional: Print prefix matrix
        System.out.println("Prefix Matrix:");
        for (int[] r : prefix) {
            for (int ele : r) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // Take input for submatrix range
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter top-left corner (a, b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter bottom-right corner (c, d): ");
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Validate and calculate submatrix sum
        int rows = arr.length;
        int cols = arr[0].length;

        if (a >= 0 && b >= 0 && c < rows && d < cols && a <= c && b <= d) {
            int total = prefix[c][d];

            if (a > 0) {
                total -= prefix[a - 1][d];
            }
            if (b > 0) {
                total -= prefix[c][b - 1];
            }
            if (a > 0 && b > 0) {
                total += prefix[a - 1][b - 1];
            }

            System.out.println("Sum of submatrix from (" + a + "," + b + ") to (" + c + "," + d + ") is: " + total);
        } else {
            System.out.println("Invalid range input.");
        }

        sc.close();
    }
}
