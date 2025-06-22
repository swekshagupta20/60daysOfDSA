public class max_min_sum_avg {
 
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max; 
    }

    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min; 
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum; 
    }

    public static int avg(int[] arr){
        int avg = sum(arr) / arr.length;
        return avg; 
    }

    public static void main(String [] args){

        int arr[] = {10, 20, 30, 40, 50};

        // max 
        int max_element = max(arr);
        System.out.println("The element with max value is: " + max_element );

        // min
        int min_element = min(arr);
        System.out.println("The element with min value is: " + min_element );

        // sum
        int sum_element = sum(arr);
        System.out.println("The sum of all elements is: " + sum_element );

        // avg 
        int avg_element = avg(arr);
        System.out.println("The average of all elements is: " + avg_element );      
    }
}
