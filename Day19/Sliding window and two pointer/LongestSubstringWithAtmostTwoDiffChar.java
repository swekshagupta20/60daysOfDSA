// we have to find length of longest substring with atmost two distinct characters 
// we use sliding window for the same 
// we use distinct counter because if we use normal counter to count freqnecy>2, we might count for the same char multiple times 
// while is used in distinct counter cause till the time we dont remove all extra characters, we cant proceed with j++; 

public class LongestSubstringWithAtmostTwoDiffChar {

    public static int longestSubstring(String s){

        int i = 0; 
        int j = 0;
        int window; 
        int maxLen = 0; //initially 
        int distinct = 0; 
        int[] freq = new int[26]; // here we take char-'a'

        while(j<s.length()){

            // if the charater is appearing for the first time, we increase its distinct count 
            if(freq[s.charAt(j)-'a']==0){
                distinct++; 
            }
            freq[s.charAt(j)-'a']++; // updating freq of ele at j


            //checking if count >2
            while(distinct>2){
                freq[s.charAt(i)-'a']--; //we would remove ele at i from the window thus decreasing the freq 
                if (freq[s.charAt(i) - 'a'] == 0) {
                distinct--;  // completely removed one type of character
    }
                i++; // incrementing i 
            }
            window = j-i+1;
            maxLen = Math.max( maxLen, window); 
            j++; //incrementing j 

        }
        return maxLen; 
    }


    public static void main(String[] args) {
        System.out.println("Code for length with longest substring with atmost two diff characters: ");
        String s = "abcbcaa";  

        System.out.println("String before is: " + s);
        // conveting 
        int ans = longestSubstring(s);
        System.out.println("Max len is: "+ ans);
    }
        
}

