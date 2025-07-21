// logic is to make another array for towers with nearest smaller tower 
// if two towers have the same distance, go for smaller height 
// if they have same height and same distance, go for the one which has less index 

public class nearestSmallerTower {

    // Main logic function to find nearest smaller tower for each element
    public static int[] tower(int[] arr) {
        int len = arr.length;
        int[] answer = new int[len];  // Result array to store nearest smaller tower index for each element

        // Loop through each element to process its left and right neighbors
        for (int i = 0; i < len; i++) {
            int left = i - 1;    // Initialize left pointer
            int right = i + 1;   // Initialize right pointer

            int leftIndex = -1;  // Index of nearest smaller tower on the left
            int rightIndex = -1; // Index of nearest smaller tower on the right

            // Traverse left side to find nearest smaller tower
            while (left >= 0) {
                if (arr[left] < arr[i]) {
                    leftIndex = left;
                    break;  // Stop at first smaller element
                }
                left--;
            }

            // Traverse right side to find nearest smaller tower
            while (right < len) {
                if (arr[right] < arr[i]) {
                    rightIndex = right;
                    break;  // Stop at first smaller element
                }
                right++;
            }

            // Now decide which index to choose based on rules
            if (leftIndex == -1 && rightIndex == -1) {
                // No smaller tower on either side
                answer[i] = -1;
            } else if (leftIndex == -1) {
                // Only right tower exists
                answer[i] = rightIndex;
            } else if (rightIndex == -1) {
                // Only left tower exists
                answer[i] = leftIndex;
            } else {
                // Both left and right smaller towers exist
                int distLeft = i - leftIndex;       // Distance to left tower
                int distRight = rightIndex - i;     // Distance to right tower

                if (distLeft < distRight) {
                    // Left is nearer
                    answer[i] = leftIndex;
                } else if (distRight < distLeft) {
                    // Right is nearer
                    answer[i] = rightIndex;
                } else {
                    // Both are equidistant, so use height as tie-breaker
                    if (arr[leftIndex] < arr[rightIndex]) {
                        answer[i] = leftIndex;
                    } else if (arr[rightIndex] < arr[leftIndex]) {
                        answer[i] = rightIndex;
                    } else {
                        // Heights also equal, choose smaller index
                        answer[i] = Math.min(leftIndex, rightIndex);
                    }
                }
            }
        }

        return answer;
    }

    // Driver code to test the logic
    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 5, 3};  // Input array of tower heights
        int[] res = tower(arr);       // Call function and get result

        // Print the output
        for (int r : res) {
            System.out.print(r + " ");
        }
    }
}
