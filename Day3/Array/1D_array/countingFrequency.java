
import java.util.Scanner; 
 
// we are counting frequency of a particular element in an array  

public class countingFrequency{
 
    public static int frequency(int[] arr, int x){
        // x is the element whose frequency we are finding  
        int freq= 0; // to check whether element is present in the array or not 

    for(int i=0; i<arr.length; i++){
        
        if(arr[i]==x){
            freq++; 
        }
    }

        return freq;
}


    public static void main(String[] args){

        Scanner val = new Scanner(System.in);


        // int [] arr = new int[5]; do when we have to take inputs dynammically 
        int arr[] = {10,20,30,40,50,80,50,10,10,100};

        System.out.println("enter the element you want to find frequency of: ");
        int x = val.nextInt();

        //deletion function 
        int result= frequency(arr,x);
        System.out.println("The frequency of element" + x + "is" + result);
      

        val.close(); // closing scanner class 
        
    }
}
