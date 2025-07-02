public class StringConcatenation {
    public static void main(String[] args) {
        String a = "Good";
        String b = "Morning";

        // using + operator
        String result1 = a + " " + b;

        // using concat() method
        String result2 = a.concat(" ").concat(b);

        System.out.println(result1); // Good Morning
        System.out.println(result2); // Good Morning
    }
}
