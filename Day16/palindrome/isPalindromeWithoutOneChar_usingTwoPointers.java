public class isPalindromeWithoutOneChar_usingTwoPointers {

    // Main function  
    public static boolean isValidPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                // Try skipping either start or end mismatched character
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
        }

        return true;
    }

    // Standard two-pointer palindrome checker on substring [start...end]
    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("aabbcdbba")); // false
        System.out.println(isValidPalindrome("abca"));      // true ("a**c**a", skip 'b')
        System.out.println(isValidPalindrome("racecar"));   // true
        System.out.println(isValidPalindrome("deeee"));     // true
        System.out.println(isValidPalindrome("abc"));       // false
        System.out.println(isValidPalindrome("abccaa"));    // true (skip one of the 'c's)
    }
}
