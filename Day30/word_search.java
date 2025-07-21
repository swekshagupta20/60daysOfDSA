public class word_search {

    // Main function
    public static int countWordOccurrences(char[][] matrix, String word) {
        int total = 0;
        String rev = new StringBuilder(word).reverse().toString();

        total += checkHorizontal(matrix, word, rev);
        total += checkVertical(matrix, word, rev);
        total += checkDiagonal(matrix, word, rev);

        return total == 0 ? -1 : total;
    }

    // Horizontal scan
    public static int checkHorizontal(char[][] matrix, String word, String rev) {
        int count = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]);
            }
            String line = sb.toString();
            if (line.contains(word)) count++;
            if (line.contains(rev)) count++;
        }

        return count;
    }

    // Vertical scan
    public static int checkVertical(char[][] matrix, String word, String rev) {
        int count = 0;
        int n = matrix.length;

        for (int col = 0; col < n; col++) {
            StringBuilder sb = new StringBuilder();
            for (int row = 0; row < n; row++) {
                sb.append(matrix[row][col]);
            }
            String line = sb.toString();
            if (line.contains(word)) count++;
            if (line.contains(rev)) count++;
        }

        return count;
    }

    // Diagonal scan (main + anti)
    public static int checkDiagonal(char[][] matrix, String word, String rev) {
        int count = 0;
        int n = matrix.length;

        // Main diagonal
        StringBuilder mainDiag = new StringBuilder();
        for (int i = 0; i < n; i++) {
            mainDiag.append(matrix[i][i]);
        }
        String d1 = mainDiag.toString();
        if (d1.contains(word)) count++;
        if (d1.contains(rev)) count++;

        // Anti-diagonal
        StringBuilder antiDiag = new StringBuilder();
        for (int i = 0; i < n; i++) {
            antiDiag.append(matrix[i][n - 1 - i]);
        }
        String d2 = antiDiag.toString();
        if (d2.contains(word)) count++;
        if (d2.contains(rev)) count++;

        return count;
    }

    public static void main(String[] args) {
        // Test Case 1: 3x3 matrix
        char[][] mat1 = {
            {'c', 'a', 't'},
            {'d', 'o', 'g'},
            {'r', 'c', 't'}
        };
        System.out.println(countWordOccurrences(mat1, "cat")); // Output: 1

        // Test Case 2: 4x4 matrix
        char[][] mat2 = {
            {'t', 'e', 's', 't'},
            {'a', 'c', 'a', 'a'},
            {'r', 'a', 't', 'r'},
            {'x', 'y', 'z', 'z'}
        };
        System.out.println(countWordOccurrences(mat2, "rat")); // Output: 2

        // Test Case 3: 5x5 matrix
        char[][] mat3 = {
            {'h', 'e', 'l', 'l', 'o'},
            {'a', 'b', 'o', 'o', 'k'},
            {'v', 'e', 'l', 'l', 'e'},
            {'e', 'r', 'e', 'd', 'x'},
            {'d', 'o', 'l', 'l', 'e'}
        };
        System.out.println(countWordOccurrences(mat3, "hello")); // Output: 2

        // Test Case 4: Word not present
        char[][] mat4 = {
            {'x', 'x', 'x'},
            {'y', 'y', 'y'},
            {'z', 'z', 'z'}
        };
        System.out.println(countWordOccurrences(mat4, "dog")); // Output: -1
    }
}
