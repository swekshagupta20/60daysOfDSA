public class StringCharConversion {
    public static void main(String[] args) {
        String str = "Code";

        // string to char array
        char[] ch = str.toCharArray();

        for (char c : ch) System.out.print(c + " ");  // C o d e

        // char array to string
        String newStr = new String(ch);
        System.out.println("\n" + newStr);  // Code
    }
}
