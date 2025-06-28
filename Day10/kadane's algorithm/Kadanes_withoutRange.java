//kadanes without range 
public class Kadanes_withoutRange{

    public static int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int Sum = arr[0];


        for (int i = 1; i < arr.length; i++) {
            Sum = Math.max (arr[i], arr[i] + Sum);
            maxSum = Math.max (maxSum , Sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + max);
    }
}
