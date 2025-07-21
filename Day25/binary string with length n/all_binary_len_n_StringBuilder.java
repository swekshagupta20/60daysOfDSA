// we use recursion here 

public class all_binary_len_n_StringBuilder {
    public static void binary(int len, int idx, StringBuilder sb){

        // base case
        if(idx == len){
            System.out.println(sb);  // incorrect output will happen here
            return;
        }

        // append '1' 
        sb.append('1');
        binary(len, idx + 1, sb);
        sb.deleteCharAt(sb.length()-1); //backtracking for '1'

        // append '0' 
        sb.append('0');
        binary(len, idx + 1, sb);
        sb.deleteCharAt(sb.length()-1); //backtracking for '0'
    }

    public static void main(String[] args) {
        int len = 3;
        StringBuilder sb = new StringBuilder();

        // starting with MSB = 1
        sb.append('1');

        binary(len, 1, sb);
    }
    
}
