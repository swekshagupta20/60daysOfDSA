
import java.util.Scanner; 

public class linearSearch{
    public static void main (String [] args){

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the value to be searched: ");
        int val = input.nextInt();

        System.out.println("Enter the length of array:: ");
        int len = input.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter the array in which you want to searching operation: ");
        
        for (int i = 0; i < len; i++) {
            int x = input.nextInt();
            arr[i]= x;
        }

        //linear search 
        for(int j=0; j< len; j++) {
            if(arr[j]==val){
                System.out.println("element found at location: " + j );
            }
        }
    }
}
