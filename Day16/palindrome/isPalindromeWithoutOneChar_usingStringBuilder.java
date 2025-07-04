
public class isPalindromeWithoutOneChar_usingStringBuilder {
    public static boolean isPalindrome(String str) {
        StringBuilder sb1 = new StringBuilder(str);                 // Original string
        StringBuilder sb2 = new StringBuilder(str).reverse();       // Reversed string

        // Check for perfect palindrome first
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }

        // Find mismatched characters
        StringBuilder diff1 = new StringBuilder();  // Mismatched from original
        StringBuilder diff2 = new StringBuilder();  // Mismatched from reversed

        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                diff1.append(sb1.charAt(i));
                diff2.append(sb2.charAt(i));
            }
        }

        // If more than 2 mismatches, can't fix by removing 1 character
        if (diff1.length() > 2) {
            return false;
        }

        // Reverse diff2 and compare to diff1
        diff2.reverse();

        return diff1.toString().equals(diff2.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abca"));     // true
        System.out.println(isPalindrome("aabbaa"));   // true
        System.out.println(isPalindrome("aabcd"));    // false
        System.out.println(isPalindrome("racecar"));  // true
    }
}

