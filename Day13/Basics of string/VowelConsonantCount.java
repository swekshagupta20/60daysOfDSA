public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Java Programming";
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

