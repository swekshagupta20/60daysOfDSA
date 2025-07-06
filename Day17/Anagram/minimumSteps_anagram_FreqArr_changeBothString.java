

public class minimumSteps_anagram_FreqArr_changeBothString {
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
        // if we use freq array to traverse, we will have to divide the steps by 2  
        //because it would contain steps for both the strings 
        for(int j=0; j<freq.length; j++){
            steps+= Math.abs(freq[j]);
        }
        System.out.println("Number of steps is: "+ steps/2);
    }
}
