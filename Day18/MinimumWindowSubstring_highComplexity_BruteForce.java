//Given two strings s and t, our goal is to return minimum window substring of s such that it contains all characters of t
//including duplicates 
//else print empty string 
//window -> len >= l.length()

//method 2 is by using hash set

public class MinimumWindowSubstring_highComplexity_BruteForce {
    public static void main(String[] args) {
        String s = "abccdheshfeuf";
        String t = "hescc";
        int window = t.length();
        int min_len = s.length() + 1;
        String result = "";
        int a = -1; // index where minimum window starts

        while (window <= s.length()) {
            for (int i = 0; i <= s.length() - window; i++) {
                String sub = s.substring(i, i + window);
                StringBuilder sb_t = new StringBuilder(t);

                for (int j = 0; j < sub.length(); j++) {
                    char x = sub.charAt(j);
                    int y = sb_t.indexOf(String.valueOf(x));
                    if (y != -1) sb_t.deleteCharAt(y);
                }

                if (sb_t.length() == 0) {
                    // All characters matched
                    min_len = window;
                    a = i;
                    break; // since we found min at this window size, no need to continue for same window
                }
            }
            window++;
        }

        if (a != -1) {
            System.out.println("Length of the string is: " + min_len);
            System.out.println("String is: " + s.substring(a, a + min_len));
        } else {
            System.out.println("No such window exists" + result);
        }
    }
}
