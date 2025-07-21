// printing all binary strings of length n with exactly k 1's

public class all_binary_string_length_n_exactly_k1 {

    public static void binary(int n, int k, int count, String str){
        // count will keep a track of no of 1's used so far 

        // base 1 
        if(str.length()==n && count==k){
            System.out.println(str);
            return; 
        }
        if(str.length()==n){
            return; 
        }
        
        binary(n, k, count, str+'0');
        binary(n,k,count+1, str+'1'); 

    }


    public static void main(String[] args) {


        System.out.println("Printing all binary strings of given length with no of 1's equal to k: ");
        int n=3; 
        int k=2; 
        binary(n,k,0,"");
        
    }
    
}
