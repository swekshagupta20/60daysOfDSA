public class traversal_diagonal_secondary {

    //only done for square matrix- whose row and column are of equal length 
    public static void main(String[] args) {

        int[][] arr = {{10,88,20,30},{34,56,67,33},{44,66,33,76},{24,56,55,44}};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i][arr.length-i-1] + " ");
            System.out.println();
        }
    }
    
}
