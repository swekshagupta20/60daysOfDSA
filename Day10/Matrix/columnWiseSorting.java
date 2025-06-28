import java.util.Arrays;

public class columnWiseSorting {

    //another method to sort is transposing original matrix then sort row wise then transpose result again 
    
    public static void main(String[] args) {
        
        int[][] arr = {
            {10, 88, 20, 30},
            {34, 56, 67, 33},
            {44, 66, 33, 76}
        };

        // before sorting
        System.out.println("Before column wise sorting");
        System.out.println(Arrays.deepToString(arr));

        int rows = arr.length; 
        int cols = arr[0].length;

        for (int i = 0; i < cols; i++) {
            int[] arrNew = new int[rows];

            // extract column i
            for (int j = 0; j < rows; j++) {
                arrNew[j] = arr[j][i];  
            }

            Arrays.sort(arrNew);

            // put sorted values back to column i
            for (int k = 0; k < rows; k++) {
                arr[k][i] = arrNew[k];
            }
        }

        // after sorting
        System.out.println("After column wise sorting");
        System.out.println(Arrays.deepToString(arr));
    }
}

