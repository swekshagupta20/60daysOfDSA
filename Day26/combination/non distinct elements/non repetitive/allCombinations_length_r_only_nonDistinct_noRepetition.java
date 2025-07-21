import java.util.Arrays;

public class allCombinations_length_r_only_nonDistinct_noRepetition {

    public static void comb(char[] distinct, int[] freq, String original, int index, String sb, int[] countFreq) {

        // base case
        if (sb.length() == 3) {
            System.out.println(sb);
            return;
        }

        for (int i = index; i < distinct.length; i++) {
            char ch = distinct[i];
            int j = ch - 'a'; // j is index of this character in freq and countFreq

            if (countFreq[j] < freq[j]) {
                int[] copyFreq = Arrays.copyOf(countFreq, 26); // Copy so we don't interfere with siblings
                copyFreq[j]++; // Used this character once so increasing its freqeuncy 

                comb(distinct, freq, original, i, sb + ch, copyFreq); // Recurse with updated string and countFreq
            }
        }
    }

    public static void main(String[] args) {
        String str = "abbcccdc";
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Extract distinct characters in sorted order
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        char[] distinct = new char[count];
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                distinct[idx++] = (char) (i + 'a');
            }
        }

        comb(distinct, freq, str, 0, "", new int[26]);
    }
}
