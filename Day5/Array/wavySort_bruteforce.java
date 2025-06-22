import java.util.Arrays;

public class wavySort_bruteforce{


    public static void wavySort(int[] arr){
    
        //sorting the array 
        Arrays.sort(arr);

        // taking arr.length-1 because if we have last index as even, it wont have any element to swap with 
        for(int i=0; i<arr.length-1; i=i+2){

            // swapping arr[i] & arr[i+1];
            int temp = arr[i]; 
            arr[i]=arr[i+1];
            arr[i+1]=temp;
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



