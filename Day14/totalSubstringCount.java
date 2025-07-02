public class totalSubstringCount{
    public static void main (String [] args){
        
        String str = "aaabbbbccddde"; 
        int totalSubstring;
        int len = str.length();
        totalSubstring = ((len+1)*len)/2;

        System.out.println("The total number of substrings are: "+ totalSubstring);

    }
}