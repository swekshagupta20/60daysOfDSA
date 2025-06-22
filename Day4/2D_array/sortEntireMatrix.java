import java.util.Arrays;

//sorting entire matrix which is not jagged i.e. equal number of elements in each column


/*
 * to save error occuring from jagged array or matrix 
 * boolean isJagged = false;
   int cols = arr[0].length;
   for (int[] row : arr) {

      if (row.length != cols) {
          isJagged = true;
          break;
       }
    }
    if (isJagged) {
      System.out.println("Jagged arrays are not supported.");
      return;
    }

 */

public class sortEntireMatrix{
    public static void main (String [] args){


        int[][] arr = {{2,3,1},{3,6,5},{0,5,1},{4,0,5}};

        System.out.println("Our array without sorting: ");
        for(int[] row : arr){
            for( int elem : row){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        
        //finding length of the original array incase we are using dynamic array element filling 

        int rows = arr.length;
        int cols = arr[0].length; //assuming we are not taking jagged array 

        int[] newArr = new int [rows*cols];

        // copying all elements from matrix to our new 1D array 
        int i=0;
        for(int[] row : arr){
            for( int elem : row){
                newArr[i]=elem;
                i++;
            }
        }

        //sorting newArr 
        Arrays.sort(newArr);

        // putting back the values in original matrix, basically replacing 
        int x = 0;
        for (i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = newArr[x];
                x++;
            }
        }

        //printing sorted matrix 
        System.out.println("Our array after sorting: ");
        for(int[] row : arr){
            for( int elem : row){
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
        
}