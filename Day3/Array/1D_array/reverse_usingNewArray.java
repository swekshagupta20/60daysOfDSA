import java.util.Arrays;
// done using a new array for reversing 
public class reverse_usingNewArray {
 
    public static int[] reverse(int[] arr){
        int[] arrNew = new int[arr.length]; // new array to store reversed values

        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            arrNew[j] = arr[i];
            j++;
        }

        return arrNew; 
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        // reverse
        int[] result = reverse(arr);
        System.out.println("The array after reversal is: " + Arrays.toString(result));
    }
}
