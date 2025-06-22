
import java.util.Arrays; 
import java.util.Scanner; 

public class insertion{

    public static int[] InsertElement(int[] arr, int x, int pos ){
        // x is the element to be inserted 
        // pos is the position at which it is inserted 

    int [] newArr = new int [arr.length+1];


    // copying elements before insertion 
    for(int i=0; i<pos; i++){
        newArr[i]=arr[i];
    }

    //copying new element 
    newArr[pos]=x;

    //copying element after new element 
    for(int j=pos; j<arr.length; j++){
        newArr[j+1]= arr[j];
    }
    return newArr;

    }
    public static void main(String [] args){

        Scanner val = new Scanner(System.in);


        // int [] arr = new int[5]; do when we have to take inputs dynammically 
        int arr[] = {10,20,30,40,50};

        System.out.println("enter the element you want to insert: ");
        int x = val.nextInt();

        System.out.println("enter the position/ index at which you want to insert: ");
        int pos = val.nextInt();

        if(pos<0 || pos>arr.length){
            // if condition was written pos>arr.length || pos<0 => was not allowing pos=arr.length as a valid index to be choosen 
            System.out.println(" Error!! Array out of bound and cannot be inserted");
        }
        else{
           int[] result= InsertElement(arr,x,pos);

           System.out.println("The array after insertion of element is: "+ Arrays.toString(result));
        }
        // x position means index     

        val.close(); // closing scanner class 
        
    }
}