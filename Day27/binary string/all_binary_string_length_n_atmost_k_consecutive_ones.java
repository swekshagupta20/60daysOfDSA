public class all_binary_string_length_n_atmost_k_consecutive_ones{
    public static void binary(int n, int k, String sb, int count) {
        if (sb.length() == n) {
            System.out.println(sb);
            return;
        }

        // Add 0 — resets consecutive 1s
        binary(n, k, sb + "0", 0);

        // Add 1 — only if within limit
        if (count < k) {
            binary(n, k, sb + "1", count + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing all binary strings of length n with atmost k consecutive ones: ");
        int n = 4;
        int k = 2;
        binary(n, k, "", 0);
    }
}