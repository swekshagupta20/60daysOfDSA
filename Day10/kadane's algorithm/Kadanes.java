
//kadanes with printing range and number of elements in max subarray 
public class Kadanes{

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        int start = 0;
        int maxStart = 0;
        int maxEnd = 0;

        for (int i = 1; i < nums.length; i++) {
            if (currentSum + nums[i] < nums[i]) {
                // Start new subarray at i
                currentSum = nums[i];
                start = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxStart = start;
                maxEnd = i;
            }
        }

        int length = maxEnd - maxStart + 1;
        System.out.println("Length of max sum subarray: " + length);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + max);
    }
}
