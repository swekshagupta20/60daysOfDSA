public class anagram_freqCounting {
    // to check if the given strings are anagrams or not 

    public static void main(String[] args) {
        String str1 = "silent"; 
        String str2 = "listen";

         

        // If lengths differ, they can't be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            return; 
        }

        StringBuilder sb = new StringBuilder(str2); 
        boolean flag = true;

        for (int i = 0; i < str1.length(); i++) {
            char x = str1.charAt(i);

            int idx = sb.indexOf(String.valueOf(x));

            if (idx != -1) {
                sb.deleteCharAt(idx); // Remove matched character
            } else {
                flag = false;
                break;
            }
        }

        if (flag && sb.length() == 0) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
