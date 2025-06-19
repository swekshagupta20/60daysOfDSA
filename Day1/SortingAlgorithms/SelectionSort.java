public class SelectionSort {
    public static void main (String [] args){
    
        
        int[] arr = {10, 9, 11, 6, 15, 2};

        for(int i=0; i< arr.length-1; i++){
            int minIdx= i; 
            

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIdx]){
                    int var= arr[minIdx];
                    arr[minIdx]= arr[j];
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