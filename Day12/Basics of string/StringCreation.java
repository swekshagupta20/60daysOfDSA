public class StringCreation {
    public static void main(String[] args) {
        // Created using string literal (stored in string pool)
        String s1 = "Hello";

        // Created using new keyword (stored in heap)
        String s2 = new String("World");

        System.out.println(s1);  // Hello
        System.out.println(s2);  // World
    }
}
