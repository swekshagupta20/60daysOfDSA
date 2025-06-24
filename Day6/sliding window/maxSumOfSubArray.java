public class maxSumOfSubArray{


    public static int maxSum(int[] arr, int k){

        int n = arr.length;
        int maxSum = 0;

        for(int i=0; i<k; i++){
            maxSum = maxSum + arr[i];
        }

        int tempSum = maxSum;

        // starting from k maintains our window is of size k and it's movement is in control 
        for(int i=k; i<n; i++){
            tempSum = tempSum + arr[i] - arr[i-k];
            if(tempSum>maxSum){
                maxSum = tempSum; 
            }
        }

        return maxSum;
    }

    public static void main (String [] args){

        int[] arr = {3, 6, 8, 4, 2, 1, 8};
         
        int k = 4; // assuming size of window is 4

        maxSum(arr, k); 

    }
}