
import java.util.Arrays;

public class allAnagrams{
    //find all the anagrams in a string
    //for checking anagram we use string builder this time 
    // given two strings s and p, return an array of all the start indcies of p's anagram in s
    //i/p-> s="cbaebabacd" and p="abc" then o/p->[0.6]

    public static boolean isAnagram (String s, String t){
        StringBuilder sb = new StringBuilder(t);

        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            int idx = sb.indexOf(String.valueOf(x));

            if(idx!=-1){ 
                sb.deleteCharAt(idx);
            }
            else{
                return false; 
            }
        }

        return sb.length()==0; 

           
    }

    public static void main(String[] args) {
        
        String str = "cbaebabacd";
        String str2 = "abc"; 

        //array for indexes 
        int[] arr = new int[str.length()-str2.length()];
        int x=0; 

        for(int i=0; i<str.length()-str2.length(); i++){
            String sub = str.substring(i,i+3);

            if(isAnagram(str2,sub)){
                arr[x]=i;
                x++;
            }
        }

        //printing index array 
        int[] idx = Arrays.copyOf(arr,x);
        System.out.println(Arrays.toString(idx));
    }
}