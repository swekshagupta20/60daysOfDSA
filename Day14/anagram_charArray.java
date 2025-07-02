
import java.util.Arrays;

 public class anagram_charArray{
// to check if the given strings are anagrams or not 


    public static boolean anagram(String str1, String str2){

        if(str1.length()!=str2.length()){
            return false; 
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
              return true;
        }
        else{
            return false; 
        }    
    }
    public static void main (String [] args){
        
        String str1 = "silent"; 
        String str2 = "listen";
        boolean result = anagram(str1, str2) ;

        //result  
        System.out.println("Are the two strings anagrams?: " + result);

    }
}