import java.util.Arrays;
import java.util.Scanner; 

public class rightRotation_byK {
 
    public static int[] rightRotation(int[] arr, int k){
        int len = arr.length;
        int[] arrNew = new int[len]; 

        // Normalize k (to handle cases where k > len)
        k = k % len;

        int j = 0;

        // Copy last k elements to the beginning
        for(int i = len - k; i < len; i++ ){
            arrNew[j] = arr[i];
            j++;
        }

        // Copy first (len - k) elements to the remaining part
        for (int x = 0; x < len - k; x++){
            arrNew[j] = arr[x];
            j++;
        }

        return arrNew; 
    }

    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();

        // Right rotation
        int[] result = rightRotation(arr, k);
        System.out.println("The array after right rotation by " + k + " steps is: " + Arrays.toString(result));
        
        sc.close();
    }
}
