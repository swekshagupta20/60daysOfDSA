
import java.util.Arrays;

public class longestPalindromeSubstring_n3 {
    public static boolean isPalindrome(String s){
        char[] str = s.toCharArray();
        // char[] str2 = str; -> creates a reference not copy the elements 
        char[] str2 = Arrays.copyOf(str,str.length);
        int start = 0;
        int end = str.length-1;
        char temp; 

        //reversing str2
        while(start<end){
            temp = str2[start];
            str2[start] = str2[end];
            str2[end] = temp; 
            start++;
            end--; 
        }
        return Arrays.equals(str,str2) ;  //str == str2 ->checks references but we have to check elements 
    }

    public static String LCP(String input){
        int max_len =0;
        int idx = 0;
        for(int i=0; i<input.length(); i++){
            for(int j=i+1; j<=input.length(); j++){
                String sub = input.substring(i,j);

                //checking for palindrome
                if(isPalindrome(sub)){
                    int x = sub.length();
                    if(x>max_len){
                        max_len = x; 
                        idx = i;
                    }
                }

            }
        }

        System.out.println("max length is" + max_len);
        return (input.substring(idx, idx+max_len));
    }

    public static void main(String[] args) {
        String input = "helleo world";
        LCP(input);

    }
}
