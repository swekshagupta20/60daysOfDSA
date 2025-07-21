//checking if array is sorted using recursion
//strictly increasing 

public class checking_sorted_array {
    
    public static boolean checkArray(int[] arr, int idx){

        if(idx==arr.length-1){
            return true; 
        }

        if(arr[idx]<arr[idx+1]){
            return checkArray(arr, (idx+1)); 
        }
        else{
            return false;
        }
         

    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,50};
        System.out.println("Checking if array is sorted: ");

        boolean ans = checkArray(arr, 0);
        System.out.println(ans);

    }
}
