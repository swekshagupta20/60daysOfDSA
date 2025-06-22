
import java.util.Arrays; 
import java.util.Scanner; 
 
// we are deleting element's first occurance from its position 
public class deletion{
 
    public static int[] DeleteElement(int[] arr, int x){
        // x is the element to be deleted 
        // pos is the position from which it is deleted

    int [] newArr = new int [arr.length-1];

    int pos= -1; // to check whether element is present in the array or not 
    for(int i=0; i<arr.length; i++){
        
        if(arr[i]==x){
            pos=i; 
            break; 
        }
    }

    if(pos==-1){
        System.out.println(" Error!! Element not found so cannot be deleted");
        return arr;      
    }
    
    else{
        for(int i=0; i<pos; i++){
        newArr[i]=arr[i];
    }

        for(int j=pos+1; j<arr.length; j++){
        newArr[j-1]= arr[j];
    }
        return newArr;
    }


    
    }
    public static void main(String [] args){

        Scanner val = new Scanner(System.in);


        // int [] arr = new int[5]; do when we have to take inputs dynammically 
        int arr[] = {10,20,30,40,50};

        System.out.println("enter the element you want to delete: ");
        int x = val.nextInt();

        //deletion function 
        int[] result= DeleteElement(arr,x);
        System.out.println("The array after deletion of element is: "+ Arrays.toString(result));
      

        val.close(); // closing scanner class 
        
    }
}