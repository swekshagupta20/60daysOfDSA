

public class minimumStep_anagram_FreqArr_changeOneString {
    public static void main(String[] args) {
        String s = "abccdeeaabd";
        String t = "fabbccdeeff";


        if (s.length() != t.length()) {
            System.out.println("Strings are not of equal length. Cannot compute minimum steps to make them anagrams.");
            return;
        }

        int[] freq = new int[256];
        //lower and upper caps treated differently here
        //if we want them to be treated same, convert to lowercase before using
        
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            freq[x]++;
            freq[y]--;
        }
        
        int steps = 0;
        // we aee just changing one array so we dont have to divide by 2  
        for(int j=0; j<freq.length; j++){
            if(freq[j]>0) steps+= freq[j];
        }
        System.out.println("Number of steps is: "+ steps);
    }
}
