public class InsertionSort {
    public static void main (String [] args){
    
        
        int[] arr = {10, 9, 11, 6, 15, 2};

        for(int i=1; i< arr.length; i++){
            int key= arr[i];
            int j= i-1; 
            if (arr[j]<=key){
                //do nothing as correct position 
            }

            else{ 
                while(j>=0 && arr[j]>key){
                    // j>=0 means array out of bound na ho 
                    // arr[j]>key means left mein greater elements hai so need to be shifted to right 
                    // order is j key 

                    arr[j+i]= arr[j]; // means in place of arr[i] or key 
                    j--; // to check for all elements and put them in right place 

                }
                // once sorted, we can put value of key in the desired location 
                arr[j+1]= key; 
                

                }
                
            }

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }
    }
}