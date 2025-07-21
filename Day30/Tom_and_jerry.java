/*
 * Tom and Jerry each have a list of secret numbers written on identical-length scrolls.
On any given scroll position, Tom and Jerry can each read a single number — but they notice a strange relationship.

They wonder:

Are there any two distinct scroll positions where the product of Tom’s numbers equals the sum of Jerry’s numbers?
our job is to find all such valid (i, j) pairs (with i ≠ j) that satisfy the condition above.
 */

import java.util.ArrayList;
import java.util.List;

public class Tom_and_jerry {

    public static List<int[]> findMatchingPairs(int[] tom, int[] jerry) {
        int n = tom.length;
        List<int[]> result = new ArrayList<>();

        // Check all distinct pairs (i, j) where i ≠ j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = tom[i] * tom[j];
                int sum = jerry[i] + jerry[j];

                if (product == sum) {
                    result.add(new int[]{i, j});
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] tom = {3, 1, 4, 6, 5, -1, 5, 6, 7};
        int[] jerry = {2, 7, 5, 7, 4, 5, -1, 8, 5};

        List<int[]> matches = findMatchingPairs(tom, jerry);

        if (matches.isEmpty()) {
            System.out.println("No matching pairs found.");
        } else {
            System.out.println("Matching pairs:");
            for (int[] pair : matches) {
                System.out.println("(" + pair[0] + ", " + pair[1] + ")");
            }
        }
    }
    
}
