import java.util.Scanner;

public class prefixSum_1D_range {

    // sum [0,r] = prefix[r]

    public static void main(String[] args) {

        int[] arr = {3, 8, 10, 19, 4, 6, 1};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        // Creating the prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Printing the prefix array
        for (int ele : prefix) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Taking input for range
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range (a and b):");
        int a = sc.nextInt();  // starting index
        int b = sc.nextInt();  // ending index

        // Validate range and calculate sum
        if (a >= 0 && b < arr.length && a <= b) {
            int sum;
            if (a == 0) {
                sum = prefix[b];
            } else {
                sum = prefix[b] - prefix[a - 1];
            }
            System.out.println("Sum of subarray from index " + a + " to " + b + " is: " + sum);
        } else {
            System.out.println("Invalid range. Please enter 0 <= a <= b < " + arr.length);
        }
    }
}
