import java.util.Scanner;

public class differenceArray_1D_onRange {

    public static void main(String[] args) {

        int[] arr = {10, 40, 20, 50, 60, 20, 30};

        // Taking input for range
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range (a and b):");
        int a = sc.nextInt();  // starting index
        int b = sc.nextInt();  // ending index

        System.out.println("Enter the element to be inserted: ");
        int x = sc.nextInt(); // value to be added

        // Create difference array
        int[] darr = new int[arr.length];
        darr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            darr[i] = arr[i] - arr[i - 1];
        }

        // Apply range update
        if (a >= 0 && b < arr.length) {
            darr[a] += x;
            if (b + 1 < arr.length) {
                darr[b + 1] -= x;
            }
        } else {
            System.out.println("Invalid range.");
            return;
        }

        // Restore array using prefix sum of difference array
        for (int i = 1; i < darr.length; i++) {
            darr[i] += darr[i - 1];
        }

        // Print updated array
        System.out.println("Updated Array:");
        for (int ele : darr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
