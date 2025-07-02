public class StringCompare {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b);      // true (both refer to same pool object)
        System.out.println(a == c);      // false (c is in heap)
        System.out.println(a.equals(c)); // true (content is same)
    }
}