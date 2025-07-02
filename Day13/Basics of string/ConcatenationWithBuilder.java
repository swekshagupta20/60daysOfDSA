public class ConcatenationWithBuilder {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fast"};

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word).append(" ");  // add space between words
        }

        // trim extra space at end
        String result = sb.toString().trim();

        System.out.println(result);  // Java is fast
    }
}
