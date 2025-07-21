/*
 * You are given an array of integers. 
 * Find the second largest element, but do not sort the array and do not use extra space like additional arrays.
 */

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 6, 9, 3};
        System.out.println(findSecondLargest(arr));  // Output: 6
    }
}
