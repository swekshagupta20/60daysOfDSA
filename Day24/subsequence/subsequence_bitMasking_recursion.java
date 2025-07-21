// using bit masking 
public class subsequence_bitMasking_recursion {
    public static void main(String[] args) {

        String s = "abc";
        int len = s.length();

        // Total number of subsequences = 2^n
        int total = (int) Math.pow(2, len); // or we can say 1<<n

        // Loop from 0 to 2^n - 1
        for (int i = 0; i < total; i++) {

            StringBuilder sb = new StringBuilder();

            // For each bit position
            for (int j = 0; j < len; j++) {
                // Check if the j-th bit in i is set
                if ((i & (1 << j)) != 0) {
                    sb.append(s.charAt(j)); // include s[j]
                }
            }

            System.out.println(sb.toString());
        }
    }
}


// 111(8) & 001(1) == 1 -> bitwise 'and' is performed here 