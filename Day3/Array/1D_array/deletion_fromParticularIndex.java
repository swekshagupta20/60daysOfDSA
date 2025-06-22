import java.util.Arrays;

public class deletion_fromParticularIndex {

    public static int[] deleteElement(int[] arr, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position!");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 25, 30, 40};
        int[] newArray = deleteElement(array, 2);
        System.out.println("After deletion: " + Arrays.toString(newArray));
    }
}
