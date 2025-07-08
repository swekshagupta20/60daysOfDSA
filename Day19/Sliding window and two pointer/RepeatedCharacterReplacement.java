// ques is leetcode 424
// we can replace  any characters at most k times to get the longest substring of a repeated character 
// we will use sliding window for the same, and everytime we will calulate the ele with highest freq in the window 
// and update the pointers position based on the number of different characters 
// assuming all letters are lowercase, if all are upper case, we use 'A' instead of 'a'

public class RepeatedCharacterReplacement {
    public static int replaceCharacter(String s, int k){

        int i = 0 ;
        int j = 0 ;  //stating from initial index 
        int window;
        int maxFreq = 0; 
        int[] freq = new int[26]; //26 is size for 26 alphabets, index would be of type [char-'a']
        int maxLen = 0  ;

        while(j<s.length()){

            window  = j-i+1; 
            freq[s.charAt(j)-'a']++; //updating frequency for the new element 
            maxFreq = Math.max(maxFreq, freq[s.charAt(j)-'a']); //updating the maximum frequency based on previous value and new possible value 

            if(window-maxFreq >k){
                freq[s.charAt(i)-'a']--;
                i++; 
            }
            maxLen = Math.max(maxLen, j-i+1); 
            j++; // as we r using while loop
        }
 
        return maxLen; 
    }

    public static void main(String[] args) {
        System.out.println("Code for replacing character at most k times to generate string with repreated characters: ");
        String s = "abcbcaa"; 
        int k = 2; 

        System.out.println("String before is: " + s);
        // conveting 
        int ans = replaceCharacter(s, k);
        System.out.println("Max len is: "+ ans);
    }
}
