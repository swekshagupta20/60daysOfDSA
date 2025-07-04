import java.util.Arrays;
// here I just checked for substring of string if it is palindrome or not and returned them in form of a string array. I did not find combinations in that list which
//could also lead to becoming palindromes
public class palindromicPartitioning_usingStringArray{
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;    
        }
        return true; 
    }

    public static String[] pp (String s){

        int n = ((s.length()+1)*s.length())/2; 
        String[] arr = new String[n];
        //array will only be empty if string is empty 

        int x = 0; // this is for traversing in arr

        //checking for all substrings 
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i,j);

                if(isPalindrome(sub)){
                    arr[x] = sub; 
                    x++;
                }
            }
        }
        return  Arrays.copyOf(arr,x); //returning array 
    }

    public static void main(String[] args) {
        
        String s = "aabbca";
        String[] array = pp(s);

        System.out.println("Palindromic substrings:");
        for (String str : array) {
            System.out.print(str + " ");
        }

    }

}