public class ReverseWithBuilder {
    public static void main(String[] args) {
        String str = "hello";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb.toString());  // olleh
    }
}
