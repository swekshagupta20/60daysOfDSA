public class MergeSort {


    public static void mergeSort(int [] arr, int p, int r){

        if( p<r){

            int q= (p+r)/2;
            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);
            merge(arr, p, q, r);

        }

    }

    public static void merge (int [] arr, int p, int q, int r){
        int n1= q-p+1;
        int n2= r-q;

        // creating new arrays 
        int [] L1= new int[n1];
        int [] L2= new int[n2];

        //filling elements in these arrays 
        for(int i=0; i< n1; i++){
            L1[i]= arr[p+i];

        }
        for(int j=0; j< n2; j++){
            L2[j]= arr[q+1+j];

        }

        //merging arrays back 
        int i=0; int j=0; int k=p; 
        while(i<n1 && j<n2){
            if (L1[i]<=L2[j]){
                arr[k]=L1[i];
                i++;
                k++;
            }
            else{
                arr[k]=L2[j];
                k++;
                j++;
            }
        }

        //copying extra left over elements to the original sorted array for both L1 and L2

        while(i<n1){
            arr[k]=L1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=L2[j];
            j++;
            k++;
        }
    }


    public static void main (String [] args){

        int [] arr= {10, 9, 11, 6, 15, 2};

        mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted array:");


        // for- each loop 
        for (int i : arr) {
            System.out.print(i + " ");
        }



        
        }
    }
