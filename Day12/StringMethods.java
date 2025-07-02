public class StringMethods {
    public static void main(String[] args) {
        String str = "programming";

        System.out.println(str.length());          // 11
        System.out.println(str.toUpperCase());     // PROGRAMMING
        System.out.println(str.substring(3));      // gramming
        System.out.println(str.substring(3, 6));   // gra (3 to 5)
    }
}
