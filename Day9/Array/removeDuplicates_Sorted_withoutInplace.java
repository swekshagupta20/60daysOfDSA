import java.util.Arrays;

public class removeDuplicates_Sorted_withoutInplace {

    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) return new int[0];

        // Since array is sorted, duplicates are adjacent
        int uniqueCount = 1;

        // First pass: count unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                uniqueCount++;
            }
        }

        // Create new array for unique elements
        int[] unique = new int[uniqueCount];
        unique[0] = nums[0];

        // Second pass: fill the unique array
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                unique[index] = nums[i];
                index++;
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        Arrays.sort(nums);

        int[] result = removeDuplicates(nums);

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }
}
