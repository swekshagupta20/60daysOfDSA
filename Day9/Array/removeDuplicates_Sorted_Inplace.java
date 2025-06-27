import java.util.Arrays;

public class removeDuplicates_Sorted_Inplace {

    public static void removeDuplicates(int[] arr) {
        if (arr.length == 0){
            System.out.print("empty array");

        }


        int p1 = 1;

        for(int p2 = 1; p2 < arr.length; p2++){
            if (arr[p2]!=arr[p2-1]){
                arr[p1] = arr[p2];
                p1++;
            }
        }

        //the length of array without duplicates would be elements of original array till index p1 
        //thus unique elements would be: 
        for( int x=0; x<p1; x++){
            System.out.print(arr[x] + " ");
        }
        
        // instead of for loop we can also use int[] instead of void and:-     "  return Arrays.copyOfRange(arr, 0, p1);  "
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,5,4,5,2};

        Arrays.sort(arr);

        //applying function 
        removeDuplicates(arr);

        
    }
}
