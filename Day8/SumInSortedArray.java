//find indexes or find if two elements in an array has sum given by user as an input 
import java.util.Arrays; 
public class SumInSortedArray{

    public static boolean findSum (int[] arr, int k){
        int sum = 0;
        int left = 0;
        int right = arr.length -1; 

        while (left<right){
            sum = arr[left] + arr[right];

            if(sum==k){
                System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
                return true;
            }
            else if(sum>k){
                right--;
            }
            else{
                left++;
            }
        }
        return false; 
    }
    public static void main (String [] args){

        int[] arr = {10,43,54,55,63,24,45};

        Arrays.sort(arr); 

        //ask user for sum as an input but here we r assuming it 99
        int k = 99;

        boolean answer = findSum(arr, k);

        System.out.println("Did we find a pair equal to" + k + "? :" + answer);


    }
}