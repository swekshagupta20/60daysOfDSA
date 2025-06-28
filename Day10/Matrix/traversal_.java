import java.util.Arrays; 

public class traversal_{
    public static void main(String[] args) {
       //outer loop for row 
       //inner loop for column 
        int[][] arr = {{10,88,20,30},{34,56,67,33},{44,66,33,76}};

        //using for-each loop 
        System.out.println("Using for-each loop here: ");
        for(int[] row : arr){
            for(int ele : row){
                System.out.print(ele + " "); 
                //we do not use toString() here as it gives us references of each 1D array instead of elements in array 
            }
            System.out.println();
        }

        //safe way to use toString()
        System.out.println("Using toString(): ");
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
    
        }

        //avoiding loops for traversal or printing array 
        System.out.println("Using deepToString(): ");
        System.out.println(Arrays.deepToString(arr));



    }
}
