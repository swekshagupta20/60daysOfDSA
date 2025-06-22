import java.util.Arrays;
import java.util.Scanner; 

public class leftRotation_byK {
 
    public static int[] leftRotation(int[] arr, int k){

        int [] arrNew = new int [arr.length]; 

        int len= arr.length; 
        // no else statement cause we want the code to run completely
        // "if " block is just to change the value of k it is out of bound 
        if (k>len){
            k = k % len;
        }

        int j=0;
        for(int i=k; i<=arr.length-1; i++ ){
            arrNew[j] = arr[i];
            j++;
        }

        for (int x=0; x<k; x++){
            arrNew[j]=arr[x];
            j++;
        }
        return arrNew; 
    }

        

    
    public static void main(String [] args){

        int arr[] = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();

        // left rotation
        int[] result = leftRotation(arr,k);
        System.out.println("The array after left rotation by " + k +" steps is: " + Arrays.toString(result));

        sc.close();
    }
}
