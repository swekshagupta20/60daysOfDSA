import java.util.Arrays;
import java.util.Scanner;

public class sortEntireMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter rows and columns of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        int[] temp = new int[r * c]; // 1D array to store elements

        // input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        // converting 2D to 1D for simplicity 
        int idx = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                temp[idx++] = mat[i][j];

        // sort 1D array
        Arrays.sort(temp);

        // put back sorted elements to matrix
        idx = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = temp[idx++];

        // print sorted matrix
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(mat[i][j] + "  ");
            System.out.println();
        }

        sc.close();
    }
}
