
public class z_algo {

    public static int[] z(String s) {
        int len = s.length();
        int[] arr = new int[len];
        arr[0] = 0;

        for (int j = 1; j < len; j++) {
            int n = 0;
            while (j + n < len && s.charAt(n) == s.charAt(j + n)) {
                n++;
            }
            arr[j] = n;
        }

        return arr;
    }

    public static int findPattern(String text, String pattern) {
        String combined = pattern + "$" + text;
        int[] zArr = z(combined);
        int patLen = pattern.length();

        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i] == patLen) {
                // Return the position in the original text
                return i - patLen - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        String text = "abcdabcabc";
        String pattern = "abcab";

        int index = findPattern(text, pattern);
        System.out.println("Pattern found at index: " + index);
    }
}

