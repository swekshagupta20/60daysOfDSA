public class substring_recursion {
     public static void printSubstrings(String s, int start, int end) {
        // Base case: 
        if (end > s.length()) { // substring(i,j) -> only prints substring from ele at i to ele at j-1 thus we take end>s.length() 
            // and do not take s.length()-1
            return;
        }

        // If start == end, reset start 
        if (start == end) {
            printSubstrings(s, 0, end + 1);
        }
        else {
            System.out.println(s.substring(start, end));
            printSubstrings(s, start + 1, end);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        printSubstrings(s, 0, 1);
    }
}
