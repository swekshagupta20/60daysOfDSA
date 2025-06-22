import java.util.Arrays;

public class setMatrixZero_bruteForce{


    public static void function(int[][] arr){

    int x = arr.length;
    int y = arr[0].length; 

    int [] row = new int [x];
    int [] cols = new int [y];

    Arrays.fill(row,1);
    Arrays.fill(cols,1);

    for(int i=0; i<x; i++){
        for(int j=0; j<y; j++){
            if(arr[i][j]==0){
                row[i]=0;
                cols[j]=0;
            }
        }
    }

    for(int i=0; i<x; i++){
        for(int j=0; j<y; j++){

            if(row[i]==0 || cols[j]==0){
                arr[i][j]=0;
            }
            
        }
    }
}
    public static void main (String [] args){
        
        int [][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        function(arr); 

        for(int [] row : arr){
            for(int ele : row){
                System.out.print(ele +" ");
            }
            System.out.println(); 
        }
    
    }
}



