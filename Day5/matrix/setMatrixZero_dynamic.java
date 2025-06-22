
public class setMatrixZero_dynamic{


    public static void function(int[][] arr){

    int x = arr.length;  //x is number of rows 
    int y = arr[0].length; // y is number of columns 

    for(int i=0; i<x; i++){
        for(int j=0; j<y; j++){
            if(arr[i][j]==0){

                for(int k=0; k<x; k++){
                    arr[i][k]=0;
                }
                for(int m=0; m<y; m++){
                    arr[m][j]=0;
                }
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