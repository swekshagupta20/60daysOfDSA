import java.util.Arrays;

public class allCombinations_everyLength_nonDistinct_noRepetition {

    public static void comb(char[] distinct, int[] freq, int index, String sb, int[] countFreq, int maxLen) {
        if (sb.length() > 0 && sb.length() <= maxLen) {
            System.out.println(sb);
        }

        if (sb.length() == maxLen) return;

        for (int i = index; i < distinct.length; i++) {
            char ch = distinct[i];
            int j = ch - 'a'; // index in freq[] and countFreq[]

            if (countFreq[j] < freq[j]) {
                int[] copyFreq = Arrays.copyOf(countFreq, 26); // no backtracking, so copy
                copyFreq[j]++;

                comb(distinct, freq, i, sb + ch, copyFreq, maxLen);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abbc";
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Build distinct character array (sorted)
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) count++;
        }

        char[] distinct = new char[count];
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                distinct[idx++] = (char) (i + 'a');
            }
        }

        // maxLen = total length of input string
        int maxLen = str.length();
        comb(distinct, freq, 0, "", new int[26], maxLen);
    }
}


/*  BACKTRACK VERSION
 * if (countFreq[j] < freq[j]) {
            countFreq[j]++;              // use character
            comb(distinct, freq, i, sb + ch, countFreq, maxLen);
            countFreq[j]--;              // 🔁 backtrack
        }
*/
