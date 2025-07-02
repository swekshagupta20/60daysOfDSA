public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i); // Note: not efficient for large strings
        }

        System.out.println(rev);  // olleh
    }
}
