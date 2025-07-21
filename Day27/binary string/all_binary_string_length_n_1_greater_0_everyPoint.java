// difference is that we dont check for total count of 1's and 0's. 
// we focus on the fact that before every recursive call we check if no of ones is greater and then only we proceed 

public class all_binary_string_length_n_1_greater_0_everyPoint{

    public static void binary(int n, int ones, int zeros, String sb) {
    if (sb.length() == n) {
        System.out.println(sb);
        return;
    }

    // Always allowed to add 1
    binary(n, ones + 1, zeros, sb + "1");

    // Add 0 only if ones > zeros so far
    if (ones > zeros) {
        binary(n, ones, zeros + 1, sb + "0");
    }
}
public static void main(String[] args) {


        System.out.println("Printing all binary strings of given length with no of 1's > no of 0's: ");
        int n=3; 
        binary(n,0,0,"");
        
    }
}