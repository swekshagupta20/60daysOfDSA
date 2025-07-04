public class countPalindromeSubstring {
    public static boolean palindrome(String s){
        int start = 0; 
        int end = s.length()-1;
        

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){ 
                return false;
            }
            start++;
            end--;
        }
        return true; 
    }

    public static void main(String[] args) {
        String s = "hello";
        int count = 0; 

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                boolean result = palindrome(s.substring(i,j));
                
                if(result){
                    count++;
                }
            }
        }

        System.out.println("Number of palindromic substrings is: "+ count);
    }
}
