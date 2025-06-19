public class BubbleSort {
    public static void main (String [] args){
    
        
        int[] arr = {10, 9, 11, 6, 15, 2};

        for(int i=0; i< arr.length-1; i++){
            

            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int var= arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= var;
                    
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }
    }
}