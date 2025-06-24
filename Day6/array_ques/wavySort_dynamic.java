
public class wavySort_dynamic{


    public static void wavySort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (i % 2 == 0) {
            if (arr[i] < arr[i + 1]) {
                // Swap to ensure arr[i] >= arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        } 
        else {
            if (arr[i] > arr[i + 1]) {
                // Swap to ensure arr[i] <= arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}

    public static void main (String [] args){
        
        int [] arr = {3,8,10,19,4,6,1};

        wavySort(arr); 

        // printing sorted array 
            for(int ele : arr){
                System.out.print(ele +" ");
            }
            System.out.println(); 
    
    }
}



