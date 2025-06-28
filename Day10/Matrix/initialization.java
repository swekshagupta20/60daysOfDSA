public class initialization{
    public static void main(String[] args) {
        //intitialised by datatype [][] name = new datatype[rows][cols];
        //int [][] arr = {{10,20,30},{20,30,40}}
        //jagged array-> different number of rows for every column 

        //int[][] arr2 = new int[3][4];
        int[][] arr = {{10,88,20,30},{34,56,67,33},{44,66,33,76}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){   //arr[0].length taken because array is not jagged 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}