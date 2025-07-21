// to print all binary strings of length n where total number of 1's > number of 0's

public class all_binary_string_length_n_total_1_greater_0 {
    public static void binary(int n, int count_0, int count_1, String str){
        // count_! will keep track for number of 1's and count_0 of 0

        // base 1 
        if(str.length()==n && count_1>count_0){
            System.out.println(str);
            return; 
        }
        if(str.length()==n){
            return; 
        }
        
        binary(n, count_0+1, count_1, str+'0');
        binary(n,count_0,count_1+1, str+'1'); 

    }


    public static void main(String[] args) {


        System.out.println("Printing all binary strings of given length with no of 1's > no of 0's: ");
        int n=3; 
        binary(n,0,0,"");
        
    }
    
}
