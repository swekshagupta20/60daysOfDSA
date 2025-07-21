/*
 * A teacher has a list of students' scores stored in an array. 
 * After sorting the scores, she wants to quickly check if a particular score exists (e.g., 87). 
 * Write a program that sorts the scores in ascending order and uses binary search to find whether the score exists.
 */

import java.util.Arrays;

public class ScoreFinder {
     public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] scores = {45, 67, 89, 87, 55, 70};
        Arrays.sort(scores);  // binary search requires sorted array
        int target = 87;

        int index = binarySearch(scores, target);
        if (index != -1)
            System.out.println("Score found at index " + index);
        else
            System.out.println("Score not found");
    }
    
}
