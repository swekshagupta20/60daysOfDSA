// count all binary strings of length n with equal number of zeroes and ones 

public class count_all_binary_string_length_n_equal_zeros_and_ones {
    public class BinaryEqualOnesZeros {

    public static int countEqual(int n, int ones, int zeros, int len) {
        if (len == n) {
            return ones == zeros ? 1 : 0;
        }

        int count = 0;
        count+= countEqual(n, ones + 1, zeros, len + 1); // Add 1
        count+= countEqual(n, ones, zeros + 1, len + 1); // Add 0
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = countEqual(n, 0, 0, 0);
        System.out.println("Total strings with equal 1s and 0s of length " + n + " = " + result);
    }
}
    
}
